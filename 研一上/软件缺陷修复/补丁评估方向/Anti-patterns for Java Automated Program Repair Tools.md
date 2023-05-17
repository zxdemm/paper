反模式：与基于模式的修复相反，当一个补丁违反了某个特定的模式时，那么就会认为这个补丁无效

文章实现了四种反模式：

1. Anti-delete Control Statement：删除了控制语句：删除循环和if语句
2. Anti-append Early Exit：过早插入return/exit
3. Anti-append Trivial Condition：