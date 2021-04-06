/*
Question ID: UK81551425


Consider below code of Utils.java file:

    package com.udayankhattry.ocp1;
     
    public class Utils {
        public static void main(String... args) {
            System.out.println("Inside Utils class");
        }
    }


Location of Utils.java file:

    F:.
    └───codes
        ├───src
        │       Utils.java
        │
        └───classes


You are currently at 'F:':

F:\>


Which of the following javac commands, typed from above location, will generate 
Utils.class file structure under 'classes' directory?

    F:.
    └───codes
        ├───src
        │       Utils.java
        │
        └───classes
            └───com
                └───udayankhattry
                    └───ocp1
                            Utils.class  
                            
RESPOSTA:



javac -d codes\classes\codes\src\Utils.java
*/

