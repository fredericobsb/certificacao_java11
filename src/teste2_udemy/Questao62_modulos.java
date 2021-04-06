package teste2_udemy;

/*
 Given below the directory/file structure on Windows platform:

    C:
    +---codes
    |   \---mymodule
    |           module-info.java
    |           Test.java
    |
    \---mods


Below is the code of Test.java file:

    public class Test {
        public static void main(String [] args) {
            System.out.println(String.join("-", args)); //Line n1
        }
    }

And below is the code of module-info.java file:

    module mymodule{
    }

And the command executed from C:\

javac -d mods --module-source-path codes -m mymodule

What is the result?

C:\>javac -d mods --module-source-path codes -m mymodule

codes\mymodule\Test.java:1: error: unnamed package is not allowed in named modules
 */
