package teste2_udemy;

/*
 Given below the directory/file structure on Windows platform:

    C:
    \---src
        \---library
            |   module-info.java
            |
            \---com
                \---udayankhattry
                    +---books
                    |       Book.java
                    |
                    \---members
                            Member.java


Below are the file contents:-


C:\src\library\com\\udayankhattry\books\Book.java: (Barra dupla é so pra evitar erro)

    package com.udayankhattry.books; 
     
    public class Book {
        //Lots of valid codes
    }


C:\src\library\\com\\udayankhattry\members\Member.java:

    package com.udayankhattry.members;
     
    public class Member {
        //Lots of valid codes
    }


C:\src\library\module-info.java:

    module library {
        //INSERT CODE HERE
    }


The author of this module wants to export the package 'com.udayankhattry.books' to 
'bookhouse' and 'onlinestore' modules only and 
the package 'com.udayankhattry.members' to 'test' module only.


Which of the following options, when inserted in module-info.java file, 
will fulfill his requirements?

==> VEJA NA PASTA DE PRINTS AS OPCOES DE RESPOSTA.

explicacao:

If a particular package needs to be exported to specific module(s), then qualified exports are used. Syntax of qualified exports is:

exports <package_name> to <comma_separated_list_of_modules>;


Hence to export the package 'com.udayankhattry.members' to 'test' module only, export directive will be:

exports com.udayankhattry.members to test;


and to export the package 'com.udayankhattry.books' to 'bookhouse' and 'onlinestore' modules only, export directive will be:

exports com.udayankhattry.books to bookhouse, onlinestore;


Note, the keyword is 'exports' and not 'export'.


exports com.udayankhattry.books; => Package 'com.udayankhattry.books' will be exported to all the modules and not only to 'bookhouse' and 'onlinestore' modules.


Also note that having multiple exports directive for same package is note allowed, below code causes compilation error:

exports com.udayankhattry.books to bookhouse;

exports com.udayankhattry.books to onlinestore;


Therefore correct option is:

exports com.udayankhattry.books to bookhouse, onlinestore;

exports com.udayankhattry.members to test;
 */