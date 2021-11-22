# BeyondBranchCoverage(Java+JML)


The small and medium test suites are available in the TestSuites directory.  The large test suites are in the [BuggyJavaJML](https://github.com/Amirfarhad-Nilizadeh/BuggyJavaJML) repository here on GitHub.

In the `NotVerified` directory, you can find two subdirectories for small and medium test suites. They have all repaired programs that extended static checker of OpenJML did not verify. There are two more subdirectories in each subdirectory named `Overfitted` and `FalseNegatives`. The overfitted programs have repaired programs that pass the test suite, but they are not correct patches. Also, the false negatives are repaired correct programs, but OpenJML could not verify them; they need updated specification to be verified.  
