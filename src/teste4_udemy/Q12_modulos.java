/*
 Given below the directory/file structure on Windows platform:

    C:
    +---my_codes
    |   +---basic.calc
    |   |   |   module-info.java
    |   |   |
    |   |   \---com
    |   |       \---udayankhattry
    |   |           \---ocp1
    |   |               \---calc
    |   |                   \---basic
    |   |                           BasicCalculator.java
    |   |                           Test.java
    |   |
    |   \---advance.calc
    |       |   module-info.java
    |       |
    |       \---com
    |           \---udayankhattry
    |               \---ocp1
    |                   \---calc
    |                       \---advance
    |                               AdvanceCalculator.java
    |
    \---classes


Below are the file details:-


C:\my_codes\basic.calc\module-info.java:

    module basic.calc {
        /INSERT-1/
    }


C:\my_codes\basic.calc\com\udayankhattry\ocp1\calc\basic\BasicCalculator.java:

    package com.udayankhattry.ocp1.calc.basic;
     
    import com.udayankhattry.ocp1.calc.advance.AdvanceCalculator;
     
    public class BasicCalculator {
        public static void multiply(int i1, int i2, int i3) {
            System.out.println(AdvanceCalculator.multiply(i1, i2, i3));
        }
    }


C:\my_codes\basic.calc\com\udayankhattry\ocp1\calc\basic\Test.java:

    package com.udayankhattry.ocp1.calc.basic;
     
    public class Test {
        public static void main(String[] args) {
            BasicCalculator.multiply(2, 3, 4);
        }
    }


C:\my_codes\advance.calc\module-info.java:

    module advance.calc {
        /INSERT-2/
    }


C:\my_codes\advance.calc\com\udayankhattry\ocp1\calc\advance\AdvanceCalculator.java:

    package com.udayankhattry.ocp1.calc.advance;
     
    public class AdvanceCalculator {
        public static int multiply(int... nums) {
            int res = 1;
            for(int i: nums) {
                res *= i;
            }
            return res;
        }
    }


And the below command executed from C:\

C:\>javac -d classes --module-source-path my_codes -m basic.calc,advance.calc


Which of the following changes needs to be done such that above command successfully executes?

Select 2 options.
 
 a) Replace /insert-1/ with requires advance.calc
    and
    Replace /insert-2/ with exports advance.calc
    
 b) Replace /insert-1/ with requires com.udayankhattyy.ocp1.calc.advance;
    and
    Replace /insert-2/ with exports advance.calc;
    
 c) afff. veja no udemy. copiacao do karalho. NAN.
 
 **/


