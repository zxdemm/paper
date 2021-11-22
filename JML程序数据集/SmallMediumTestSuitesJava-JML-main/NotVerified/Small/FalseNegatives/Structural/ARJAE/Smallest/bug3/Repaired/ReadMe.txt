It is an unusual patch, but it is correct. When integer overflow happens for the "a.length + index" in the while loop, the program's process will be stopped. However,
the inserted if condition the "index < a.length" will be checked; thus, it will not call the array when the array index is invalid. 
