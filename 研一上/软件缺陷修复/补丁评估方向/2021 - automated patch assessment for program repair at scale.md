# 笔记模板2

## 1. 文章解决的问题

由于ARP产生的补丁虽然通过了测试集，但是测试集可能无法正确地找出程序真正的错误，所以会需要手动测试这个补丁的正确性。然而ARP会产生大量的补丁，依靠手工测试是不行的，文章要解决自动评估补丁的问题。以及评估RGT这个方法的有效性

## 2. 解决的思路

1. 介绍了补丁评估和补丁过度拟合的背景，提出了这篇论文的动机。
2. 讲述了实验的方法包括行为差别分类、具体算法、RGT补丁的生成、正确补丁的生成
3. 讲述了实验结果，回答上一部分提出的问题
4. 

## 3. 核心知识点

* RGT(Random testing based on Ground Truth): 以人工编写的补丁为正确标准来自动产生测试用例，然后去测试自动生成的补丁，如果补丁不能使测试用例通过，说明这个机器补丁是overfitting
* ground truth patch： 人工写的补丁
* RGT补丁评估：以RGT测试用例集和ARP补丁为输入，输出没有通过的测试用例的个数。（没有通过的测试用例判断方法：将ARP补丁和手写补丁进行测试，区别二者的行为差异，如果不同，则没有通过）如果ground truth patch通过了所有测试用例，而ARP补丁没有通过，则ARP补丁为overfitting
* positives case：RGT测出的补丁错误，事实上也是错误的
* false positives：RGT测出的补丁错误，但是与人工编写的补丁正确，是正确的补丁

## 4.程序功能说明

<img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211008104944642.png" alt="image-20211008104944642" style="zoom:50%;" />



RGT的测试用例是自动生成的。具体用Evosuite和Randoop来生成的。



procedure SANITYCHECK方法：将自动生成的测试用例集进行测试(用手写的补丁$$p_{hi}$$)，若没有通过，则把这个用例从集合T中删除

procedure Assessment方法：对每一个ARP补丁进行遍历。将失败的测试用例添加$$FT_i$$中。如果$$FT_i$$不为空的话，将overfitting标签贴在该补丁上，并且要遍历该补丁对应测试集的每一个测试用例，将遇到的行为差别添加到当前的补丁对应的行为差别集合中。 当用例全部成功通过，则这个补丁是正确的。

七个行为差异：

<img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211026143209710.png" alt="image-20211026143209710" style="zoom:67%;" />

## 5. 存在的问题

1. 程序行为可以再被细分，不止七个行为差异
2. RGT测试用例的生成会产生一些冗余测试（两个测试用例等价）造成一些不必要的开销。如何使测试集最小化，测试用例的选择和用例间的优先级是改进的一个目标。

## 6. 改进的思路

1. 具体就是使用（Cheng et al. 2020）所提出的弱突变覆盖和直接分支覆盖（weak mutation coverage and direct branch coverage ）来对分支覆盖的补充。注：RGT测试用例生成是基于分支覆盖的。

   以此来细化行为差异

2. 测试集最小化、选择、优先级参考7.4章列出的作者与论文

