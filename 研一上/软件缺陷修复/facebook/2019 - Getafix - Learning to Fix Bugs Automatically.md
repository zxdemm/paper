# 笔记模板2

## 1. 文章解决的问题

基于学习的方法。从过去的修复中学习修复模式，生成类似人类的修复。最终目标是修复程序，但是修复的结果应该是跟人修复类似或一致的。（是否可以被人接受？）Getafix工具

三个挑战：

1. 在大型工业软件中减少开发人员花费在修复bug的时间
2. 使得修复被人所接受
3. 快速提出修复建议，查找修复的模板所耗费的资源控制在一个范围内

本工具的贡献：

1. 快速，以秒为单位
2. 新的聚类方法
3. 简单有效的修复排序方法
4. 可以从Error Prone 和Infer中，提取出错误类别

## 2. 解决的思路

1. 概述

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211126150104898.png" alt="image-20211126150104898" style="zoom:67%;" />

   **Learning阶段：**

   1. Tree differencer:树差异器，在AST级别上识别修改。它保存具体的编辑，将原来的AST修改为修复后的AST，不是整个程序的AST，保存的是子树==（类似于保存一次修改，保存的是AST级别）==
   2. 学习修复模式的组件，模式变量（用来匹配AST，类似于Rolim和Long）此外新的分层聚类技术以及修复模式不仅仅代码的更改，而且还有上下文的保存
   
   **Prediction阶段**：
   
   1. 将模式应用到未看到的bug代码中，因为是预测修复，所以不会对候补的修复进行验证，但是会对修复进行排序

#### 修改bug的例子 图3

<img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211129203512485.png" alt="image-20211129203512485" style="zoom: 80%;" />



#### Tree Differencer

1. Trees：为了提取细粒度的编辑，AST中的节点有以下属性：

   * 一个标签（BinEx：二进制表达式，比如a + b,   Literal,  Name）
   * a possibly empty value, " + "、“42”、“foo”
   * 子节点

   树的集合定义：

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211129175739181.png" alt="image-20211129175739181" style="zoom: 67%;" />

   一棵树有标签、值、以及属于它的子节点。不过深度好高！！！

   比如x = y + 2:  在AST表达式为 x: Name,+: BinEx(y: Name,2: Literal)

2. Tree Edits：

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211129180734591.png" alt="image-20211129180734591" style="zoom:67%;" />

   Edit是一个三元组，分别是before ast==（这里的ast应该是一整个树，这里我不确定）==，after ast 以及一组映射集合Mapping。一个映射==（这个映射匹配前后的节点，只是用来告诉我们，对应的节点是否被修改）==也是三元组，分别表示的是AST中的节点，分别是对应位置前后的节点，mod和unmod表示该节点是否被修改。修改的节点是被加粗的

   

   编辑的例子

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130145106463.png" alt="image-20211130145106463" style="zoom:67%;" />

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130145135156.png" alt="image-20211130145135156" style="zoom:67%;" />

3. 提取具体的编辑（Extracting Concrete Edits）

   Getafix使用GumTree （Falleri这个作者）算法来实现。该方法有提取（识别）四种编辑类型：删除、插入、移动以及更新。

   * 如果一个节点在before或after ast中没有存在映射节点，说明它是删除或添加。

   * 如果一个有映射的节点的父节点没有匹配映射节点（==不是没有映射==），那么说明这次编辑是移动，还有一种情况是即使父节点也匹配了，但是子节点的位置发生变化（参数位置移动），也被认为move操作

   * 具有不同值的映射节点被视为更新

   
   
   这里遇到了一个问题：图3中的第二个修复既有插入也有移动，怎么判断或对这两个修改进行分组。（不清楚是插入还是移动导致修复成功?）
   
   解决方法是GumTree方法，就是提取整个范围的具体编辑。意思是一个具体的编辑如果至少包含一个修改，那么任何一对映射节点都将转化为这个具体编辑的根。举例：图3 中的4个提取出来的编辑加上类body级别的（Worker）
   
   这个方法是用来提取多一点的具体编辑。因为到时候需要自动以最佳粒度级别对模式进行排序

#### Learning fix Patterns

这一步是从上一部分的具体编辑中抽象出修复模式，编辑模式可能会有修复变量，来表示树中不同的编辑部分。==而且Getafix关键贡献是给出一种新算法，能够产生编辑模式的层次结构==。如何得到这个层次结构是基于对编辑模式的泛化操作-----反统一（anti-unification）。

而且得到的模式尽可能保留具体信息，跟我上次看的那个相反，上次是越抽象越好。

1.  Generalizing Edit Patuerns via Anti-Unification（通过反统一泛化编辑模式）

   * Tree Patterns and Tree Edit Patterns 

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130144018187.png" alt="image-20211130144018187" style="zoom:67%;" />

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130144524276.png" alt="image-20211130144524276" style="zoom:67%;" />

     t1\t2\t3是具体编辑的树，p1~p4是tree patterns。Hole是一个集合，带有标签或？。

     与树模式类似，编辑模式（Tree Edit Patterns） 也是这样

   * 泛化Tree Patterns（Generalizing Tree Patuerns）

     这一步是为了将多个Tree Pattern泛化为同一个模式。过程叫做反统一anti-unification。反统一虽然是将tree pattern泛化了，但是它会寻找尽可能保存更多信息的==抽象模式==（之后都叫抽象模式（generalization）

     反统一的大致规则就是将相同标签、相同值、相同子树合并时，那么会将标签、值或子树一起合并，如果不一致则合并到不一致的时候会用一个hole来代替。当一个子树与由hole来表示的子树合并时，则会产生另一个hole。

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130153759085.png" alt="image-20211130153759085" style="zoom:67%;" />

     举例：

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130153850227.png" alt="image-20211130153850227" style="zoom:67%;" />

     从a、b两个Tree pattern中用了反统一后，得到以下

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130153908695.png" alt="image-20211130153908695" style="zoom:67%;" />

     当然也会产生以下的模式：

     ![image-20211130154201875](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130154201875.png)

     但是这个模式比前一个的信息少，所以会被丢弃

   * Generalizing Edit Patterns（泛化编辑模式）

     基本思想：首先反统一before tree， 然后反统一after tree。中间用一组替换来说明before tree与after tree中对应的hole

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130164047394.png" alt="image-20211130164047394" style="zoom:67%;" />

     其中stripUmmod是将before tree中没有修改的node去掉，而且由于映射的关系，也能找到after tree 中对应的节点，去掉这些节点是为了泛化编辑模式

     ==例子==

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130164825447.png" alt="image-20211130164825447" style="zoom:67%;" />

     这是两个具体的编辑。将二者写成tree pattern：

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130165010169.png" alt="image-20211130165010169" style="zoom:67%;" />

     然后使用stripUmmod函数，将没有修改过的节点删除

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130165055479.png" alt="image-20211130165055479" style="zoom: 67%;" />

     然后将$$before_g 和 after_g$$这两个节点的映射重新匹配，因为前面两个例子的映射是不一样的：

     ![image-20211130172603387](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130172603387.png)

     然后Getafix尽可能填充没有被修改的节点。

     <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211130172800343.png" alt="image-20211130172800343" style="zoom:67%;" />

2. 编辑模板的层次聚类（Hierarchical Clustering of Edit Patuerns）

   大致思想就是使用层次聚类的算法来推导层次结构。从具体的编辑开始，每次组合成对的编辑，直到所有的编辑合并成一个编辑模式。由算法选择一对编辑模式。使得它们的反统一的抽象模式损失的信息最少。

## 3. 核心知识点或名词定义

1. 考虑两个输入：（1） 一组修改，修复了一种特定的bug（2）一段带有静态分析警告的代码
2. bug一般由两种，一种是简单的bug，通常有一个特定的修复，比如将一个域用final关键词包起来。还有一个是复杂的bug，比如交互界面出现问题。遇到第二种需要上下文来解决
3. Getafix的三个步骤：
   * 将一组给定的修复拆为AST级别的编辑步骤
   * 从这些步骤中学习重复出现的修复模式，基于新的分层聚类技术
   * 对于一个bug进行修复，对候选修复进行排序
4. Infer：程序静态分析工具

## 4.程序功能说明

## 5. 存在的问题

## 6. 改进的思路

## 7. 想法来源

