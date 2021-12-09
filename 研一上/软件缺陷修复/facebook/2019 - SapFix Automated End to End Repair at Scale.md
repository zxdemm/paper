# 笔记模板2

## 1. 文章解决的问题

Sapienz（）这个测试工具中部署了一个叫SapFix来修复错误。

## 2. 解决的思路

## 3. 核心知识点或名词定义

## 4.程序功能说明

<img src="C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211207114301654.png" alt="image-20211207114301654" style="zoom: 80%;" />

$$b_{rev}:$$修复的文件        b_file:错误的文件     b_line:错误的位置    s_trace:bug或崩溃的堆栈跟踪    mid：作为崩溃唯一的id      b_author: b_rev的作者     ？buggy_expressions : Infer给出的bug表达式

3~5行是当遇到高强度崩溃时，需要用diff_revert、partial_diff_revert两种方法来，这两种方法指的是将程序员提交的change（Diff）改回来。比如Diff是添加了一行代码，那么用diff_revert之后就是将Diff中添加的代码删除。

6~7使用模板修复和突变修复。

repro_crash(p,mid)指的是用saoienz能不能再次产生一次崩溃，得到的一个mid与传入的mid一致。

如果没有，那么用sapienz_repro_mid正常运行sapienz，看一下是否能产生mid。

Diff:修改，就是对程序的修改

![image-20211207150011842](C:\Users\HDULAB601\AppData\Roaming\Typora\typora-user-images\image-20211207150011842.png)

算法2目前只支持空指针异常的修复。

第一行：识别崩溃（bug）的类型。如果不是空指针，则返回空集

4~5是在检查引发空指针的更精确的原因是否已知，如果已知，就用第5行 进行修复

第5行中的addnull check是用eclipse JDT解析错误文件的AST，然后在错误语句之前添加空检查

当不知道哪些表达式有缺陷时，就进行7~11行的代码。这个情况下，SAPFIX就会识别buggy语句中可能导致空指针的所有表达式

$$C_{buggy}$$候选的bug表达式，

## 5. 存在的问题

## 6. 改进的思路

## 7. 想法来源

