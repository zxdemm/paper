# 笔记模板2

## 1. 文章解决的问题

防止修复工具再次生成被检测出来的过拟合补丁（类似的补丁）。通过生成新的测试输入，对源程序与修补后的程序进行语义差异检查，并且测试补丁，最后生成测试用例添加到测试集。工具名称：DiffTGen

==好像《Alleviating patch overfitting with automatic test generation  a study of feasibility and effectiveness》，不过那一篇是缓解过拟合补丁的，不是完全解决过拟合问题。但是有一定程度的判断过拟合补丁==

## 2. 解决的思路

1. **Test Target Generation**

   首先将源程序、补丁、一组语法差异生成一个targetProg测试目标程序,测试生成器生成的测试输入应用在这个程序上。而测试的目标就是一条虚拟语句，生成的测试输入要至少覆盖一条虚拟语句。这样的输入可能会导致两个程序的语义差异。

   ![image-20220309202625437](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220309202625437.png)

   在例子中，13行前插入上述两条语句。其中第二条就是要覆盖的语句。其中合成的if的意思等同于

   if（ch != Y）。而为了覆盖目标，生成的测试输入一定导致源程序与补丁不同的执行路径。比如“aes”、“hes”。*这两个测试输入导致源程序不执行if(ch=="Y"),但是导致补丁程序执行if（str ！= null）*

2. **Test Method Generation**

   在这个阶段，该工具要生成测试方法来输出不同的结果，至少覆盖一个虚拟语句。使用的测试输入生成工具（EvoSuite）。

   首先生成的测试输入“@es”。
   
   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220310101629017.png" alt="image-20220310101629017" style="zoom:80%;" />
   
   然后用一个中间方法来打印不同的输出值（bug程序和补丁程序）
   
   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220310101912046.png" alt="image-20220310101912046" style="zoom:80%;" />
   
   打印的结果：
   
   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220310101944598.png" alt="image-20220310101944598" style="zoom:80%;" />
   
3. **Test Case Generation**

   根据上述的两步，生成测试用例。必须是打印的结果是不同。用oracle来判断哪个输出是正确的，如果补丁的输出不正确，则为过拟合。

   检查是否正确的方法是用defects4j中手动修复的补丁进行评价（好捞）

#### 详细说明上述的三个步骤

1. $$\delta_{syn}$$指的是每一处语义不同的地方，每一处不同都要插入一句虚拟语句（不做任何动作，只是为了覆盖）。

   对于$$\delta_{syn}$$不涉及修改if条件的，则创建一个修改语句，插入到$$\delta_{syn}$$的前面。
   
   例子：<img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220311094457042.png" alt="image-20220311094457042" style="zoom:67%;" />
   
   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220311095905067.png" alt="image-20220311095905067" style="zoom:80%;" />
   
   上述表格是一些语义不同的情况。
   
   2. **Test Method Generation**
   
      2.1 Creating an Output-Instrumented Version创建检测版本：查看一个测试输入是否暴露两个程序执行的不同不能只看它的返回值。比如上述的例子，打印了修改部分的返回值属性、调用方法的名称等信息,两个程序执行的差异会反映在其他的变量上。
   
      ==方法的参数作为input，output为return 值和抛出的异常信息==
   
      打印基本类型和string（值、类型），数组、列表、集合等创建列表，依次打印。
   
      对于每个$$m_\delta$$，都会生成一个$$m_\delta^,$$。它的方法名称和参数与原来的一致。但是在try块中会调用$$m_\delta$$。
   
      比如在下图第8行。FiledPrinter打印的六个参数：
   
      1. o_7au3e是output元素
      2. 还要打印该元素的检索信息，比如打印结果的第三行
      3. 打印结果中的5是打印的最大深度
   
      ![image-20220314150753310](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220314150753310.png)
   
      
   
   3. **Test Case Generation**
   
      3.1 在这个阶段，就要比较输出来让oracle判断哪个是正确的。就是将打印结果一行行进行比较。
   
      <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220311145518055.png" alt="image-20220311145518055" style="zoom: 67%;" />
   
      3.2 生成测试用例
   
      给定一个预期值，然后和一个要进行断言值的位置。分三步：获取要断言的输入与输出元素、获取断言值、生成断言语句。
   
      难点：如何获取要断言的输入与输出元素（也就是目标元素）？以下就是方法，保存到Map中
   
      <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220311153317193.png" alt="image-20220311153317193" style="zoom:80%;" />
      
      如何创建一个程序的测试用例的测试版本（the Test-Case-Instrumented Version of a program），还有解释如何增加一个测试方法来产生一个测试用例。
      
      * 补丁修改的方法叫delta-related method（$$m_\delta$$）
      
      在the Test-Case-Instrumented Version 中，每一个$$m_\delta$$的父类都有一个哈希表。表用来保存输入/输出元素。当保存元素的其他信息不可用时，则用null。
      
      ==如何将测试方法完善==
      
      给定oracle的预期值，output的位置，test-case-instrumented version created
      
      ![image-20220314184638689](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220314184638689.png)

## 3. 核心知识点或名词定义

1. 提供的数据：bug程序 + 补丁 + bug程序与补丁的一组语法差异 + 一个oracle。

   语法差异的一个元素是一个二元组《bug程序， 补丁》，保存的是两者相关的更改的语句。

   可以是空值null表示替换或添加，当二元组都不是null时，表示替换。

2. 该工具输出的结果是一个暴露补丁过拟合的测试用例。

3. 原程序与补丁程序语义不同的地方：$$\delta_{syn}$$,每个地方的虚拟语句：$$\delta_{sem}$$

4. 


## 4.程序功能说明

文章例子：

<img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220309200055018.png" alt="image-20220309200055018" style="zoom:80%;" />



## 5. 存在的问题

1. 需要自己来给出正确的测试输出（对于新的测试输入），耗费人力资源。

## 6. 改进的思路

## 7. 想法来源

