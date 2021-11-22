# 笔记模板2

## 1. 文章解决的问题

使用形式化的方法（规范与验证specification verification）提供一种正式规范（F ormal Behavioral Specification）和自动验证工具来判断补丁是否过拟合。消除了由测试用例不完整以及人为的偏见。



这个规范是基于JML（Java Modeling Language），JML是用来判断补丁的正确性的。



文章指出了影响APR工具的两个新问题：程序复杂性的变化和数值问题。还给出了一个新的数据集（正确的程序+bug版本的程序+ 测试集）

文章使用了7种修复工具：Astor中的Cardumen , jGenProg, jKali, jMutRepair、Arjae、Nopol、KaliA

用OpenJML通过JML来验证每个程序的正确性（就是给定的数据集中的正确的程序）

一种解决过拟合的思路是加强测试用例，是使用Opad（Overfitted Patch Detection）等工具来产生测试用例，这个工具是基于AFL（American Fuzzy Lop：一种模糊测试的工具）来实现的。



## 2. 解决的思路

1. 为什么用新的数据集：Defects4j一般是不会说程序的正确行为是什么，所以很难将程序的规范写出来。对于其他的数据集来说，JML的库还没有覆盖到，所有也不适用了

2. 产生测试集的方法（JMLKelinci fuzzing tool）：这个会尝试覆盖所有的分支来找新的路径

3. 产生bug集的方法（PITest）：PITest通过更改控制条件、更改赋值表达式、删除方法调用和更改返回值来生成bug

4. 测试集共有547个bug程序，使用了修复工具后的到的补丁

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211115192059503.png" alt="image-20211115192059503" style="zoom:67%;" />

5. 文章使用OpenJML静态分析器来验证补丁的过拟合问题，结果如下：

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211115193509500.png" alt="image-20211115193509500" style="zoom:67%;" />

6. 使用了OpenJML后又进行了对结果的验证，针对Verified的结果，一个都没有问题。对于Not Verified，结果如下：

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211115194321812.png" alt="image-20211115194321812" style="zoom:67%;" />

7. 

## 3. 核心知识点或名词定义

1. OpenJML是一种契约式设计（Design by contract）：有前置条件（必须满足这个条件则才能满足后置条件）、后置条件（调用这个方法一定会得到的结果）、不变量（保证什么不会变），以SML Solver为组建，进行jml语法检查、代码静态检查、生成运行时测试类

2. 使用了JML后的例子

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211115184717042.png" alt="image-20211115184717042" style="zoom:67%;" />

3. 文章提供的数据集有30个项目，项目基本上是一些著名的算法或数据结构。小程序可以用完整的正式规范来描述预期行为。

4. 数据集分两部分：1 有JML规范的正确的java程序，2 有缺陷的java程序。测试集是通过模糊测试的工具，bug是通过变异工具来产生的

## 4.程序功能说明

## 5. 存在的问题

一些修复工具存在的问题：

* 修改了时间复杂度和空间复杂度
* 不符合模块的规范，而对整个程序来说是正确的：JML对每一个模块产生规范，由于程序破坏了规范，导致OpenJML无法自动验证补丁

## 6. 改进的思路

这个也是一个可取的方向，包括APR工具以后的发展方向，利用规范不仅仅可以用来检测过拟合补丁，也可以将JML作为APR的一部分。毕竟当前软件的开发是十分复杂的，对于每一个模块都是有严格的定义

## 7. 想法来源

1. J. Yang, A. Zhikhartsev, Y . Liu, and L. Tan, “Better test cases for
   better automated program repair,” inProceedings of the 2017 11th Joint
   Meeting on F oundations of Software Engineering. ACM, 2017, pp.
   831–841.使用Opad这个工具的模糊测试来加强现有的测试用例
