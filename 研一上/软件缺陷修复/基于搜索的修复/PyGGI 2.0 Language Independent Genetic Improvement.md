# 笔记模板2

## 1. 文章解决的问题

## 2. 解决的思路

pyggi的介绍：

1. 文件引擎：

   新的功能：同一源代码下的不同文件可以由不同的引擎管理。

   有三个具体的引擎：

   * pyggi-line用于行级操作
   * 两个pyggi-tree用于python和xml树形操作

   对于第二种来说，使用不同的解析器将除python以外的语句翻译成树形结构就能实现对其他语句的修改

2. xml集成：

   例子：源代码如何转换成xml树：在srcml中其实会更加复杂

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220110093537399.png" alt="image-20220110093537399" style="zoom:67%;" />

3. 实验部分一：

   从QuixBugs中选择了31个程序。

   用basic descent first hill climbing algorithm作为搜索算法。每次从最好的补丁中添加一个编辑或删除一个编辑来生成一个邻近的解决方案
   
   实验结果
   
   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220110104736308.png" alt="image-20220110104736308" style="zoom:67%;" />
   
   line和statement不同级别的。statement是用srcml中的标签来表示的
   
   为四个程序找到了22个补丁
   
4. 实验部分二

   减少运行时间，专门用于MiniSAT求解器

   实验设计：同时对语句和布尔值进行操作。语句中只对“break”“continue”“decl_stmt”"do"语句进行考虑。以及对“do”"if""while"中的布尔表达式进行操作

   

## 3. 核心知识点或名词定义



1. GI跟遗传算法没什么区别，在文章中也是用arja等文章来说明gi对APR的用处.不过gi还能提高程序的性能
2. PYGGI作为一个GI工具，最初是具有行级编辑和ast节点的编辑操作。
3. 用srcML这个xml形式的代码表示。

## 4.程序功能说明

## 5. 存在的问题

## 6. 改进的思路

在这里有一个新的方向：GI，遗传改良。用来做功能性或非功能性的程序属性的改进。==能否实现时间复杂度的改进==

## 7. 想法来源

