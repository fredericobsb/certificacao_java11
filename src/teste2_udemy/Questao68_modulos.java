package teste2_udemy;

/*
  On Windows platform below directories/files are available:

1.

C:\codes\printarguments\module-info.java:

    module printarguments{
    }


2.

C:\codes\printarguments\com\udayankhattry\ocp1\Test.java:

    package com.udayankhattry.ocp1;
     
    public class Test {
        public static void main(String... args) {
            System.out.println(String.join("-", args));
        }
    }


3.

C:\mods\


After compilation below directory/file structure is generated:

    C:
    +---codes
    |   \---printarguments
    |       |   module-info.java
    |       |
    |       \---com
    |           \---udayankhattry
    |               \---ocp1
    |                       Test.java
    |
    \---mods
        \---printarguments
            |   module-info.class
            |
            \---com
                \---udayankhattry
                    \---ocp1
                            Test.class


And the commands executed from C:\

1. java -p mods -m printarguments POWER DRIVEN

2. java -p mods -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN

3. java -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN -p mods

4. java --module-source-path src -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN

5. java --module-source-path mods -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN

6. java --module-path mods --module printarguments POWER DRIVEN


How many of the above commands print POWER-DRIVEN on to the console? 

RESPOSTA:

Static overloaded method join(...) was added in JDK 1.8 and has below declarations:

1. public static String join(CharSequence delimiter, CharSequence... elements) {...}: It returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.

For example,

String.join(".", "A", "B", "C"); returns "A.B.C"

String.join("+", new String[]{"1", "2", "3"}); returns "1+2+3"

String.join("-", "HELLO"); returns "HELLO"


If delimiter is null or elements refer to null, then NullPointerException is thrown. e.g.,

String.join(null, "A", "B"); throws NullPointerException

String [] arr = null; String.join("-", arr); throws NullPointerException


But if single element is null, then "null" is considered. e.g.,

String str = null; String.join("-", str); returns "null"

String.join("::", new String[] {"James", null, "Gosling"}); returns "James::null::Gosling"


2. public static String join​(CharSequence delimiter, Iterable<? extends CharSequence> elements) {...}: It returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.

For example,

String.join(".", List.of("A", "B", "C")); returns "A.B.C"

String.join(".", List.of("HELLO")); returns "HELLO"


If delimiter is null or elements refer to null, then NullPointerException is thrown. e.g.,

String.join(null, List.of("HELLO")); throws NullPointerException

List<String> list = null; String.join("-", list); throws NullPointerException


But if single element is null, then "null" is considered. e.g.,

List<String> list = new ArrayList<>(); list.add("A"); list.add(null); String.join("::", list); returns "A::null"

Please note: String.join("-", null); causes compilation error as compiler is unable to tag this call to specific join(...) method. It is an ambiguous call.


If command-line arguments: POWER and DRIVEN are passed, then System.out.println(String.join("-", args)); will print POWER-DRIVEN.



Format of the java command related to module is:

java [options] -m <module>[/<mainclass>] [args...]

java [options] --module <module>[/<mainclass>] [args...]

     (to execute the main class in a module)

     

--module or -m: It corresponds to module name. -m should be the last option used in the command. -m is followed by module-name, then by optional mainclass and any command-line arguments. If module is packaged in the jar and 'Main-Class' attribute is set, then passing classname after -m <module> is optional.

     

And below is the important option (related to modules) of java command:

--module-path or -p: It represents the list of directories containing modules or paths to individual modules. A platform dependent path separator (; on Windows and : on Linux/Mac) is used for multiple entries.

For example, java -p out;singlemodule;connector.jar represents a module path which contains all the modules inside 'out' directory, exploded module 'singlemodule' and modular jar 'connector.jar'.


Let's check all the commands:

java -p mods -m printarguments POWER DRIVEN ✗ As it is an exploded module hence mainclass is not optional.

java -p mods -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN ✓ It prints POWER-DRIVEN on to the console.

java -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN -p mods ✗ -m option must be the last option.

java --module-source-path src -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN ✗ --module-source-path is not a valid option of java command

java --module-source-path mods -m printarguments/com.udayankhattry.ocp1.Test POWER DRIVEN ✗ --module-source-path is not a valid option of java command

java --module-path mods --module printarguments POWER DRIVEN ✗ As it is an exploded module hence mainclass is not optional.


Hence, only one command produces expected output.
*/
