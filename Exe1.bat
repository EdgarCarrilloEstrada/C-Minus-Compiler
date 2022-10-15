call javacc cminusparser.jj
timeout /T 1 /nobreak
call javac cminusparser.java
timeout /T 1 /nobreak 
java cminusparser < "ERROR codigo3 - ES6.txt" > "Prueba de analisis ERROR codigo3-6.txt"
taskkill /IM notepad.exe
"Prueba de analisis ERROR codigo3-6.txt"