call javacc cminusparser.jj
timeout /T 1 /nobreak
call javac cminusparser.java
timeout /T 1 /nobreak 
echo Codigo correcto 1
java cminusparser < "CORRECTO codigo1.txt" > "temporal.txt"
echo Codigo correcto 2
java cminusparser < "CORRECTO codigo2.txt" > "temporal.txt"
echo Codigo correcto 3
java cminusparser < "CORRECTO codigo3.txt" > "temporal.txt"
echo Codigo correcto 4
java cminusparser < "CORRECTO codigo4.txt" > "temporal.txt"
echo Codigo con error 1-1
java cminusparser < "ERROR codigo1 - ES1.txt" > "temporal.txt"
echo Codigo con error 2-2
java cminusparser < "ERROR codigo2 - ES2.txt" > "temporal.txt"
echo Codigo con error 3-3
java cminusparser < "ERROR codigo3 - ES3.txt" > "temporal.txt"
echo Codigo con error 1-4
java cminusparser < "ERROR codigo1 - ES4.txt" > "temporal.txt"
echo Codigo con error 2-5
java cminusparser < "ERROR codigo2 - ES5.txt" > "temporal.txt"
echo Codigo con error 3-6
java cminusparser < "ERROR codigo3 - ES6.txt" > "temporal.txt"
echo Codigo con error 1-7
java cminusparser < "ERROR codigo1 - ES7.txt" > "temporal.txt"
echo Codigo con error 2-8
java cminusparser < "ERROR codigo2 - ES8.txt" > "temporal.txt"
pause
"temporal.txt"