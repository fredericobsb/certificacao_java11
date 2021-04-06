package teste4_udemy;

abstract class Logg {
    abstract long count(); //Line n1
    abstract Object get(); //Line n2
}
 
class CommunicationLog extends Logg {
    int count() { //Line n3
        return 100;
    }
    
    String get() { //Line n4
        return "COM-LOG";
    }
}
 
public class Q28_overrriding_special {
    public static void main(String[] args) {
        Logg log = new CommunicationLog(); //Line n5
        System.out.print(log.count());
        System.out.print(log.get());
    }
}

/*
 There are 2 rules related to return types:

1. If return type of overridden method is of primitive type, then overriding method should 
use same primitive type.

2. If return type of overridden method is of reference type, then overriding method can use 
same reference type or its sub-type (also known as covariant return type).


count() method at Line n1 returns long but overriding method at Line n3 returns int and 
that is why Line n3 causes compilation error.

get() method at Line n2 returns Object but overriding method at Line n4 returns String. 
String is a subclass of Object, so it is a case of covariant return type and hence allowed. 
Line n4 compiles successfully.
 */
