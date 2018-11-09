# TL

## Lenguaje utilizado:
Java

## Librerías utilizadas:
Javacc

## Compilar proyecto:
1- Compilar archivo .jjt 
    Ej: jjtree flex.jjt
    
2- Compilar archivo .jj
    Ej: javacc flex.jj
    
3- Ejecutar todos los archivos .java
    Ej: javac *.java
    
## Ejecutar parser:
1- Ejecutar el archivo comp.java, pasar como parámetro el archivo a analizar
    Ej: java comp < ejemplos/Ejemplo.txt
