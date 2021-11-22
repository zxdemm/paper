The bug of "BankAccount bug28" is fixed. However, it inserts a statement in the "isValid" method (a pure method) that changes the value of the "balance" field. The "isValid" method's visibility is protected, and a tester can change the "balance" value. So, we consider the repaired program as an overfitted program.  

