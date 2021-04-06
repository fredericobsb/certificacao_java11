package teste2_udemy;

public class Questao76NullTeste {
    char var1;
    double var2;
    float var3;
    byte var4;
    short var5;
    long var6;
    
    Integer var7;
    String var8;
    Character var9;
    Long var10;
    Float var11;
    Double var12;
    Byte var14;
    Short var15;
    
    
    
    public static void main(String[] args) {
    	Questao76NullTeste obj = new Questao76NullTeste();
        System.out.println(">" + obj.var1);//char
        System.out.println(">" + obj.var2);//double
        System.out.println(">" + obj.var3);//float
        System.out.println(">" + obj.var4);//byte
        System.out.println(">" + obj.var5);//short
        System.out.println(">" + obj.var6);//long
        System.out.println(">" + obj.var7);//Integer
        System.out.println(">" + obj.var8);//String
        System.out.println(">" + obj.var9);//Character
        System.out.println(">" + obj.var10);//Long
        System.out.println(">" + obj.var11);//Float
        System.out.println(">" + obj.var12);//Double
        System.out.println(">" + obj.var14);//Byte
        System.out.println(">" + obj.var15);//Short
    }
}

/*
 Primitive type instance variables are initialized to respective zeros: 
 	byte: 0, short: 0, int: 0, long: 0L, float: 0.0f, double: 0.0, boolean: false, 
 	char: \u0000. 
 	
 	When printed on the console; byte, short, int & long prints 0, 
 	float & double print 0.0, boolean prints false and 
 	
==>	char prints nothing or non-printable character (whitespace). 

Reference type instance variables are initialized to null.
 */



