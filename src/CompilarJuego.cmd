:Cambiamos el path
set PATH=D:\Program Files\Java\jdk1.8.0_60\bin;%PATH%
:Compilamos los archivos dentro de la carpeta Modelo y Controlador
javac Modelo/*.java Controlador/*.java
:Creamos el primer jar que contiene Modelo y Controlador
jar cvf Paquete1.jar Modelo/*.class Controlador/*.class
:Compilamos los archivos dentro de la carpeta Vista
:#Mod2-INI
javac -cp gson-2.3.1.jar;Paquete1.jar;xstream-1.4.8.jar;xpp3_min-1.1.4c.jar Vista/*.java
:#Mod2-FIN
:Compilamos el archivo Program.java que contiene el main
javac Program.java
:Crear el manifest.txt
echo Manifest-Version: 1.0>manifest.txt
echo Main-Class: Program>>manifest.txt
:#Mod2-INI
echo Class-Path: Paquete1.jar gson-2.3.1.jar xpp3_min-1.1.4c.jar xstream-1.4.8.jar>>manifest.txt
:#Mod2-FIN
:Creamos el jar ejecutable de nuestro proyecto
jar cvfm Juego.jar manifest.txt Vista/*.class Program.class
