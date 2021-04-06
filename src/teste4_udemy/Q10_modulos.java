/*
 
 Your Vendor has provided you a modular jar to test the database connection API.

Below are the Jar details:

Jar File name: dbconnection.jar

Module name: dbconnection

Class name: com.database.util.DBConnect

Method: public static void connect(String dbURL, String username, String passowrd) {...}

module-info.java contents:

    module dbconnection {
        exports com.database.util to dbtester;
    }


File/Directory structure on your Windows platform is:

    C:
    +---source
    |   \---dbtester
    |       |   module-info.java
    |       |
    |       \---com
    |           \---udayankhattry
    |               \---test
    |                       DBTester.java
    |
    +---classes
    \---jars
            dbconnection.jar


C:\source\dbtester\module-info.java:

    module dbtester {
        requires dbconnection;
    }


C:\source\dbtester\com\udayankhattry\test\DBTester.java:

    package com.udayankhattry.test;
     
    import com.database.util.DBConnect;
     
    public class DBTester {
        public static void main(String... args) {
            DBConnect.connect("temp", "admin", "pT12uY3$$");
        }
    }


Which of the following javac commands compile your module code successfully? 




RESPOSTA:

javac -d classes --module-source-path source -p
jars\dbconnection.jar -m dbtester
 
 
 
 
 
 
 
 */
