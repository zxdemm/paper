# 笔记模板2

## 1. 文章解决的问题

利用Genetic imporvement来选择以及应用插入、删除、替换等操作

实验使用的是PyGGI这个GI遗传改进工具。

## 2. 解决的思路

1. 工具大致思路：如果一个ast上有n条语句，则有n种删除的可能，$$n^2$$的插入和替换的可能，以及5m个比较运算符的编辑。选择这三种的操作（变异算子）概率有偏差，见截图。

2. 实验结果：

   2.0采用统一策略：

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111145015205.png" alt="image-20220111145015205" style="zoom:67%;" />

   27个bug程序中8个程序找到了68个补丁。其中25个补丁在语法上是唯一的。在后面用这个25补丁做研究

   1.0采用的初始策略：==有85个补丁，33个语法唯一的补丁==

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111145508764.png" alt="image-20220111145508764" style="zoom:67%;" />

   下表为多少个独特的补丁（只有这个策略出现的补丁）：

   ![image-20220111145950000](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111145950000.png)

   下表为各种编辑操作在补丁中的占比：patch下的百分比指的是操作出现在补丁中的占比，edits指的是操作在所有操作的占比。

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111150724562.png" alt="image-20220111150724562" style="zoom:67%;" />

   反正就是偏向插入与替换，而不是删除

   
   
   下表为各操作有效性的表。<表示为生成的补丁或变体比原来的适应度更好。> 表示比原来的差，=表示与原来的一致。
   
   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220112144434144.png" alt="image-20220112144434144" style="zoom:67%;" />

## 3. 核心知识点或名词定义

* 插入操作：只能在语句前插入

* 如何表示ast：用SrcML来表示基于XML的ast，然后PYGGI用这样子的ast表示形式来修改程序

* ![image-20220111133629671](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111133629671.png)

* 插入、删除、替换（语句级别）以及6个比较操作符（变异）的修改操作

* 什么是统一策略：每一种编辑方法都有相等的概率被选中，包括操作符的空间

* PyGGI2.0采用局部爬山搜索算法（寻找当前最好的相邻状态）

* 文中说的两步选择策略就是先选择用哪个操作，然后操作的语句或比较符。

* ![image-20220112101021271](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220112101021271.png)

  

## 4.程序功能说明

## 5. 存在的问题

## 6. 改进的思路

## 7. 想法来源

