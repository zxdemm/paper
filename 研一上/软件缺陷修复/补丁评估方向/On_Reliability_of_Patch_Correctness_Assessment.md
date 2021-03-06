# 笔记模板2

## 1. 文章解决的问题

文章指出评估补丁正确性的方法分两类：

* Automated annotation ： 修复工具作者给出的判断结果，作者会有偏差性的认识
* Author annotation ： 通过额外的测试集来判断

文章通过收集35个专业开发人员作为独立注释者（判断补丁）来为8种自动修复工具的189个补丁构建一组黄金正确性标签，然后用这个组标签去和上述两者方法进行对比，来评估上述两种方法的可靠性



## 2. 解决的思路

1. 生成35位专业人员的黄金集，首先就是补丁集的来源：GenProg Kali Nopol ACS S3 Angelix Enum CVC4通过上述几个修复工具来产生补丁

2. 专业人员给出黄金集时，对补丁标签的选择：每一个补丁由5个人来判断

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211116162605136.png" alt="image-20211116162605136" style="zoom:67%;" />

   以下为35为人员的评价结果
   
   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211117141727086.png" alt="image-20211117141727086" style="zoom:67%;" />
   
   第一列说明的是大家一致认同（没有选其他选项）的补丁数量，第二列说明除了 unknown以外其他一致认同的补丁数量，第三列就是大多数认同的补丁数量
   
   然后还根据了一系列的数学方法对35位人员可信度进行评估他们提交的答案
   
   ==这部分回答了问题一：35个人在对补丁的评价上能否达成一致？==
   
3. 问题二：作者注释的可靠性如何？

   <img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211117144210836.png" alt="image-20211117144210836" style="zoom:67%;" />

   这个表显示了修复工具作者对补丁评价与黄金集的一致与不同

   实验数据显示注释者与作者发生分歧的情况发生在判断时间较长的情况下。

4. 问题三：利用额外的测试集是否对补丁的评估有效？

   ITS（independent test suite）：生成测试用例的工具DIFFTGEN 和 Randoop

   大多数黄金集中不正确的补丁都没有被检测出来。

   DIFFTGEN检测出27个过拟合的补丁

5. 讨论

   * APR作者应该公开它们的补丁以及补丁是否正确的信息。
   * 通过ITS可以增强作者的评估，尽管效率较低

## 3. 核心知识点或名词定义或文章中需要知道的背景

* bug集来源：Defects4j 、S3

## 4.程序功能说明

## 5. 存在的问题

## 6. 改进的思路

未来的一些方向：

* 评估 评估结果的方法也是必要的，尽管成本比较大
* 规范的使用：计划用JML的规范以及用OpenJML来验证程序的正确性

## 7. 想法来源

