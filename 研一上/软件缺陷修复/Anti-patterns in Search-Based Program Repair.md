# 笔记模板2

## 1. 文章解决的问题

设法找出一组正确的补丁。通过反模式（违反了特定的模板）来去除一些通过给定测试用例的补丁。使得自动修复工作朝着正确和完整的修复发展。

1. 反模式与基于模式的修复有什么区别
2. 是什么让给定的补丁可信，为什么它是不正确的
3. 这些看似合法的补丁是否具有共同点，如何将它们与正确的补丁区别开来？

## 2. 解决的思路

首先定义了什么是反模式。

1. 基于模式的修复中的修复模板是源自人类生成的补丁常见的bug修复模式，而反模式是源于机器生成的补丁。

## 3. 核心知识点或名词定义

反模式的几大模式：

1. 禁止删除return语句、退出语句等
2. 禁止删除控制语句：if、循环等语句
3. 禁止删除只有一条语句的方法或块
4. 出现在后续的if语句条件中的变量不允许在声明阶段被删除
5. 出现在循环终止条件中的变量不允许在循环中删除它的赋值语句==感觉有点问题==
6. 禁止在除了块函数的最后一行以外插入return语句
7. 禁止插入琐碎的条件

## 4.程序功能说明

## 5. 存在的问题

## 6. 改进的思路

## 7. 想法来源

MintHint利用符号执行来合成一个Oracle。

