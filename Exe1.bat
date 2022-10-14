call javacc cminusparser.jj
timeout /T 1 /nobreak
call javac cminusparser.java
timeout /T 1 /nobreak 
java cminusparser < "ERROR codigo1 - ES1.txt" > "Prueba de analisis ERROR codigo1.txt"
taskkill /IM notepad.exe
"Prueba de analisis ERROR codigo1.txt"