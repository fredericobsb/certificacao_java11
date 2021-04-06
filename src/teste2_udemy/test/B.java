package teste2_udemy.test;

import teste2_udemy.A;

public class B extends A {
    public void print() {
        A obj = new A();
        System.out.println(obj.i1); //Line 8
        System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }
    
    public static void main(String [] args) {
        new B().print();
    }
}
