package teste2_udemy;

class MyClass {
    MyClass() {
        System.out.println(101);
    }
}
 
class MySubClass extends MyClass {
    final MySubClass() {//only public, protected & private are permitted
        System.out.println(202);
    }
}
public class Questao29Construtores{
    public static void main(String[] args) {
        System.out.println(new MySubClass());
    }
}
