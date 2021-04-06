package teste2_udemy;
/*
 Consider three independent modules with the same name 'messages' in three different 
 directories:

    C:
    ├───out1
    │   └───messages
    │       │   module-info.class
    │       │
    │       └───com
    │           └───udayankhattry
    │               └───ocp1
    │                       Main.class
    │
    ├───out2
    │   └───messages
    │       │   module-info.class
    │       │
    │       └───com
    │           └───udayankhattry
    │               └───ocp1
    │                       Main.class
    │
    └───out3
        └───messages
            │   module-info.class
            │
            └───com
                └───udayankhattry
                    └───ocp1
                            Main.class
 
 main(String...) method of Main class defined in 'out1' contains: 
 System.out.println("KEEP IT SIMPLE");

main(String...) method of Main class defined in 'out2' contains: 
System.out.println("NEVER GIVE UP");

main(String...) method of Main class defined in 'out3' contains: 
System.out.println("YES YOU CAN");

And the command:

java -p out3;out2;out1\messages -m messages/com.udayankhattry.ocp1.Main


What is the result?

 a) NEVER GIVE UP
 
 B) KEEP IT SIMPLE
 
 C) it causes error because of the duplicated modules found
 
 d) YES YOU CAN    <== RESPOSTA
 
 ** explicacção:
 
 Format of the java command related to module is:

java [options] -m <module>[/<mainclass>] [args...]

java [options] --module <module>[/<mainclass>] [args...]

     (to execute the main class in a module)

     

--module or -m: It corresponds to module name. -m should be the last option used in 
the command. -m is followed by module-name, then by optional mainclass and any 
command-line arguments. If module is packaged in the jar and 'Main-Class' attribute 
is set, then passing classname after -m <module> is optional. 

     

And below is the important option (related to modules) of java command:

--module-path or -p: It represents the list of directories containing modules or 
paths to individual modules. A platform dependent path separator 
(; on Windows and : on Linux/Mac) is used for multiple entries.

For example, java -p out;singlemodule;connector.jar represents 
a module path which contains all the modules inside 'out' directory, 
exploded module 'singlemodule' and modular jar 'connector.jar'.


When multiple modules with the same name are in different directories on the module path, first module is selected and rest of the modules with same name are ignored. As first module directory in the module path is 'out3', hence YES YOU CAN is the output.
 */
