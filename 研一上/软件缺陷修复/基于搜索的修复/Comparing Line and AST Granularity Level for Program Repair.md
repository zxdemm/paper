# 笔记模板2

## 1. 文章解决的问题

这里介绍了pyggi1.1版本。这篇文章是实验性的文章，目标在于比较ast级别的编辑和行级别的 这两种粒度的编辑哪个更有效

## 2. 解决的思路

## 3. 核心知识点或名词定义

*  在1.1版本中有两种粒度级别的修改：行和ast，行对应的是词法方法（Lexical），ast对应的是句法级别（Syntactic）

  例子

  <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111160534841.png" alt="image-20220111160534841" style="zoom:67%;" />

  pyggi中的原子操作：

  <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111160944503.png" alt="image-20220111160944503" style="zoom:67%;" />

  移动和删除可以根据这两个原子操作组合完成。

  pyggi可以修改修改点的权值，改变ast粒度的级别

* 搜索算法：Tabu 算法（禁忌算法）寻找全局最优解

* 适应度函数：失败测试用例的数量

实验结果：

对于10个bug，每次跑20次。successful runs指的是至少有一个补丁的次数。

bug的分类：1. 1、3、7修复这三个需要特殊的成分， 2. 2、8、10 这三个不需要特殊成分。

Valid Patch指的是不会破坏程序语法的补丁（编译通过）

![image-20220111191630117](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111191630117.png)

### 最终结果

ast级别（语句级别）的修改比行级的修改要好，而且ast的能产生行级操作无法生成的补丁

## 4.程序功能说明

<img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111155540081.png" alt="image-20220111155540081" style="zoom:67%;" />

绿色是用户提供的。其中improve.py是一个调用pyggi这个api的文件



==Tabu搜索算法==：用来寻找最好的补丁

![image-20220111190540668](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20220111190540668.png)

## 5. 存在的问题

## 6. 改进的思路

## 7. 想法来源

