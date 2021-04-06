package teste2_udemy;

/*
 Given below the directory/file structure on Windows platform:

    C:
    +---src
    |   \---tester
    |       |   module-info.java
    |       |
    |       \---com
    |           \---udayankhattry
    |               \---ocp1
    |                   \---test
    |                           TestStringUtil.java
    |
    +---out
    \---bin
        \---stringutility
            |   module-info.class
            |
            \---com
                \---util
                        StringUtil.class


There is an exploded module 'stringutility' available under bin directory and its module 
descriptor file exports the package 'com.util'.


Below are the codes of Java files:-


C:\src\tester\module-info.java:

    module tester {
        requires stringutility;
    }


C:\src\tester\com\\udayankhattry\ocp1\test\TestStringUtil.java:

    package com.udayankhattry.ocp1.test;
     
    import com.util.StringUtil;
     
    public class TestStringUtil {
        public static void main(String[] args) {
            System.out.println(StringUtil.repeat("Tic", 5));
        }
    }


Which of the following sets of javac and java command execute successfully, if executed from C:\?  

1)javac -d out --module-source-path src --module-path bin -m tester
  java --module-path bin;out -m 
  tester/com.udayankhattry.ocp1.test.TestStringUtil

2)javac -d out --module-source-path src --module-class-path bin -m tester
  java --module-path bin;out -m tester

3)javac -d out --module-source-path src, bin -m tester
  java --module-path out -m tester/com.udayankhattry.ocp1.test.TestStringUtil

4)javac -d out --module-source-path src;bin -m tester
  java --module-path bin -m tester/com.udayankhattry.ocp1.test.TestStringUtil

 */


