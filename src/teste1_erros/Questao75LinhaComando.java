package teste1_erros;


	class _____ {
	    public static void main(String [] args) {
	        System.out.println("ALL IS WELL");
	    }
	}

/**
 * And the command:  java --source 11 01_Msg
 * 
 * Following options are available to replace /INSERT/:

1. Msg

2. 01_Msg

3. 01Msg

4. Msg01

5. Msg_01

6. Message

7. $msg

EXPLICACAO:

Starting with JDK 11, it is possible to launch single-file source-code Programs.

If you execute 'java --help' command, you would find below option was added for Java 11:

java [options] <sourcefile> [args]

    (to execute a single source-file program)

   

Single-file program is the file where the whole program fits in a single source file and it is very useful in the early stages of learning Java.


If you pass a file name with .java extension to java command, then java command consider the passed file as 'single-file source-code program'. But if any other file name is passed, then it considers the passed file as the class name. So, in this case, if you run the command `java 01_Msg`, then java command searches for the class with the name '01_Msg' and would thrown an error.

F:\>java 01_Msg

Error: Could not find or load main class 01_Msg

Caused by: java.lang.ClassNotFoundException: 01_Msg


If the file does not have the .java extension, the --source option must be used to force source-file mode.

`java --source 11 01_Msg` instructs the java command to process the 01_Msg as Java 11 source code.


Please note that file name can be any name supported by underlying operating system, hence 01_Msg is a valid file name.

Class names can be any name following Java identifier naming rules:

- It should with a letter, the dollar sign "$", or the underscore character "_".

- Subsequent characters may be letters, digits, dollar signs, or underscore characters.

- It must not be a java keyword.


Based on above identifier naming rules 01_Msg and 01Msg are invalid identifiers and rest are valid, hence out of 7 options, 5 options can successfully replace /INSERT	/.


Please note that source-file can contain package statement and multiple classes (even public) but first class found must have special main method 'public static void main(String [])'. 
 */