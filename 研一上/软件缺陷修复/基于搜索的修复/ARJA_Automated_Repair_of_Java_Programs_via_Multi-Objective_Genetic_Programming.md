# 笔记模板1

## 1. 自我提问

1. NSGA2是一种怎么样的算法
2. 测试过滤程序(test filtering procedure)是什么，它是如何被提出的
3. ARAJ是什么，如何进行修复的
4. 与最开始的GP相比，它的效率高在什么地方，为什么高
5. 如何修复多bug的程序
6. type matching strategy 这个策略是什么

## 2. 自我解答

1. 是一种基于多目标搜索的遗传编程。文中它是以寻找适应度最小的两个函数值作为目标的。文中的遗传是将$$x$$这个解的集合进行交叉和变异
2. 当一个bug确定了它对应的成分语句涉及的范围后，如果一个成功的测试用例没有执行任何一条该范围内的语句，则在验证这个补丁的阶段，这个测试用例是不会被测试的。它提出来就是为了提高效率的。
3. **a**utomated **r**epair of **Ja**va programs，它是一种基于多目标搜索，采用多种策略来减少搜索空间的技术。而且它是一种对程序修复细粒度的技术。GP是一种高粒度的，它的遗传算子是针对一条或多条语句。修复过程见它的图。
4. 
   * 减少了搜索空间：操作初始化operation initialization、成分筛选ingredient screening、解决方案解码solution decoding
   * 减少了计算适应度的时候，测试用例的个数
5. s
6. 用来扩大成分语句的范围，尽可能在成分语句里找到能够修复bug的语句

## 3. 文章的核心问题与思路

## 4. 可能改进的地方

## 5. 文章流程图

## 6. 算法流程图

多目标遗传算法详解链接：

https://blog.csdn.net/wanjiac/article/details/103828223

PF的解释：在Pareto front中的所有解皆不受Pareto Front之外的解（以及Pareto Front 曲线以内的其它解）所支配 https://blog.csdn.net/u010180815/article/details/78994486

算法流程图：

![image-20210925111214107](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20210925111214107.png)

算法具体过程分析：

1. fault localization and Coverage Analysis：使用一则公式$$susp(lc) = \frac{N_{CF}}{\sqrt{N_{F}+(N_{CF} + N_{CS})}}$$ 来获取语句的可疑度

   $$N_{CF}$$:错误测试用例执行了多少次这条语句

   $$N_{CS}$$正确的测试用例执行了多少次这条语句

   $$N_{F}$$错误的测试用例个数

   对每条语句都使用一个三元组(cls, lid, susp)分别对应（类名， 语句所在行，可疑度）

   设置两个参数来控制可能出现错误的语句的数量，以此来减少搜索空间，参数分别为$$\gamma_{min}$$:可疑度最小的值，$$n_{max}$$:修改点数量的最大值。

   ==这部分找到的是错误语句==

2. Test Filtering: 

   将成功的用例中执行过的语句与可能有bug的语句以及有关系的语句进行对比，如果前者的语句跟后者没有关联，则过滤这些用例，这样可以加快适应度评估期间的速度

3. scope determination：

   Cls and Med: 有可能错误的语句的类和方法。

   该技术还会将其中可见的变量和方法也加入到定位的范围里。

   比如Med中的参数、Med中定义的局部变量、Med中可以访问的直接变量(Cls中声明的变量、Cls的父类继承而来的变量、Cls外部类中的变量)

4. Ingredient Screening:

   为每个可能有bug的语句选择一些语句作为成分语句，使用的策略是location awareness 策略。

   有三种可以选择的成分模式：File、Package、Application。即成分语句只能在指定的文件夹、包、或全局的app里选择（与有bug的语句存在的位置一致）

   接下去是两种成分筛选的方法

   * 直接方法（Direct Approach）：将种子语句一个个测试过去，当检测的语句（种子语句）没有来自前面的成分模式指定的地方，则会被忽略。否则将会被记录这条语句所涉及的变量和方法，将变量和方法与第三步中的确定的范围进行确认，如果所有的变量和方法都一一对应了，则这条种子语句就是一条成分语句(ingredient statements )。
   * Type Matching Based Approach(基于类型匹配的方法)：前面与直接方法相同，当变量与方法没有与范围一一对应时，该方法不会立刻丢弃这变量和方法，而是会在确定范围里找（变量类型或方法类型匹配），如果变量类型或方法参数类型刚刚能匹配上，则也会将它加入到成分语句里

   ==这部分找到的是成分语句==

5. Evolving Program Patches：使用 multi-objective GP来编码补丁。将前面得到的数据进行编号。

   修改点（modification points）的序号用j 来表示，共n个修改点。

   修改点对应的成分语句的集合用$$I_j$$来表示，集合里的成分语句也是随机排序的

   操作类型O：删除、插入、替换

   每一个解都可以被表示为$$x=(b,u,v)$$.  b是一个1*n的向量，有0、1表示，为x是否选择在第j个修改点编辑错误语句。u是一个关于操作的向量。$$u_j$$ = 2,表示在j号的修改点采用替换操作。 v就是找第j个修改点对应的成分集合的成分语句的序号

   解的生成过程：首先$$b_j$$初始化的值：$$b_j= \begin{cases} 0& 1-susp_j*\mu\\ 1& susp_j*\mu \end{cases}$$, $$u$$是一个开始时就设置的变量，在0~1之间。对于$$u_j 、v_j$$也都是随机取值的

6. 适应度计算：

   为了计算适应度x，需要同时缩小两个函数值：$$f_1(x)$$修复的bug语句的数量、$$f_2(x)$$加权失败率

   ![image-20210927082846072](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20210927082846072.png)

   ![image-20210927083201810](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20210927083201810.png)

   w是一个全局参数、$$T_f$$ 是失败的测试用例的数量、$$T_c$$是经过筛选的成功测试用例的数量

   第二个函数值为0时，说明所有用例通过，x是一个完全正确的补丁

   第一个函数为0时，说明一个bug都没修复

   

7. 遗传算子的使用：https://blog.csdn.net/LOVEmy134611/article/details/111698662

8. 使用NSGA-II算法进行进化算法。

   对于b向量，采用的是半均匀交叉（half uniform crossover）

   对于u和v采用单点交叉single-point crossover和均匀变异uniform mutation

9. 基于规则的搜索空间缩减（Rule-Based Search Space Reduction）

   * 对操作类型(删除、替换、添加)设定一定的规则:比如不删除变量声明语句、不删除return、throw语句
   * 对成分语句进行过滤
   * 禁用一些操作类型：当x中的$$u_j$$有值，会去3.7.3中的table3查找是否符合要求，否则不予执行

10. 算法总结：

    当无法找到足够的补丁时，有以下三种可能的原因：

    * ARJA所选择的搜索空间没有修复bug的成分，即成分语句没有用
    * 第一种条件满足，但是搜索算法的还是不够强大。而且GP搜索容易陷入局部最优解
    * bug定位不准确（缺陷定位算法不理想、测试集不能有效地测试出bug）

11. 

## 7. 文章中的名词

seed statements： 任何junit测试用例执行过的语句

ingredient statements :将要被用来替换和插入的语句的集合，从seed statements中来的。就是用来修补错误语句的语句

modification points： 从可能有bug的语句、作用域中的变量和方法的范围、对应的成分语句，三者合起来叫修改点

