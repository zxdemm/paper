# Refining Fitness Functions for Search-Based Program Repair

# Refining Fitness Functions in Test-Based Program Repair

​     本文提出两步适应度计算（针对测试用例），首先通过的测试用例越多，那么对应的补丁优先级更高。当按照boolean的值相同时，就需要计算预期与实际输出的差距。用差距来对补丁进行排名。

​      将无限循环、程序崩溃等（不产生输出）情况视为最大的损失。再对产生不准确的输出的补丁进行距离度量。

相关工作：

1. 利用中间程序状态（Souza提出）Eduardo Faria de Souza, Claire Le Goues, and Celso Gonçalves Camilo-Junior. 2018.A novel fitness function for automated program repair based on source
   code checkpoints. InGenetic and Evolutionary Computation Conference. ACM,
   1443–1450.

2. 除了测试用例失败以外，函数还记录了测试接触到的修改点数量。

   Yoowon Jang, Quang-Ngoc Phung, and Eunseok Lee. 2019. Improving the Effi-
   ciency of Search-Based Auto Program Repair by Adequate Modification Point. In
   International Conference on Ubiquitous Information Management and Communica-
   tion (Advances in Intelligent Systems and Computing), Vol. 935. Springer, 694–710.

   