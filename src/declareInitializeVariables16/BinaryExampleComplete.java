package declareInitializeVariables16;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Out of Ordinary: Binary Literals
*/

public class BinaryExampleComplete {
    public static void main(String[] args) {
        //  8-bit 'byte' values:
        byte byte1 = (byte) 0b01111111;  //imprime 127  => 0b + 8 digitos
        byte byte2 = (byte) 0b10000000;  //imprime -128 => 0b + 8 digitos
        byte byte3 = (byte) 0b00100001; //imprime 33    => 0b + 8 digitos
        
        
        //byte byte4_0 = (byte) 0b;//-> Invalid binary literal number (only '0' and '1' are expected)
       
        byte byte4_1_1_ = (byte) 0b00000000000000000000000000000001;//limite para compilar: 0b + 32 digitos. Imprimiu 1.
        byte byte4_1_1_0 = (byte) 0b10000000000000000000000000000000;//0
        byte byte4_1_1_1 = (byte) 0b10000000000000000000000000000001;//1
        byte byte4_1_1_2 = (byte) 0b10000000000100000111000000000001;//1
        byte byte4_1_1_3 = (byte) 0b11000000000100000111000000000000;//0
        byte byte4_1_1_4 = (byte) 0b10000000000100000111000000000000;//0
        byte byte4_1_1_5 = (byte) 0b10000000000100000000000000000000;//0
        byte byte4_1_1_6 = (byte) 0b10000000000000000000000000000000;//0
        byte byte4_1_1 = (byte) 0b00000000;//imprime 0
        byte byte4_1_2 = (byte) 0b0000000;//0
        byte byte4_1_3 = (byte) 0b000000;//0
        byte byte4_1_4 = (byte) 0b00000;//0
        byte byte4_1_5 = (byte) 0b0000;//0
        byte byte4_1_6 = (byte) 0b000;//0
        byte byte4_1 =   (byte) 0b00;//0
        byte byte4 =     (byte) 0b0;//0 -> qtd minima de digitos para compilar.
        byte byte4_2 = (byte) 0b01;//1
        byte byte5 =   (byte) 0b1;//1
        byte byte5_0 =   (byte) 0b001;//1
        byte byte5_1 =   (byte) 0b0001;//1
        byte byte5_2 =   (byte) 0b00001;//1
        byte byte5_3 =   (byte) 0b000001;//1
        byte byte5_4 =   (byte) 0b0000001;//1
        byte byte5_5 =   (byte) 0b00000001;//1
        byte byte5_6 =   (byte) 0b000000001;//1
        byte byte5_7 =   (byte) 0b0000000001;//1
        byte byte5_8 =   (byte) 0b00000000001;//1
        byte byte5_9 =   (byte) 0b000000000001;//1
        byte bytezero_ =   (byte) 0b0;//0 -> qtd minima de digitos para compilar.
        byte byteum__ = (byte) 0b01;//1
        byte byteum___ =   (byte) 0b1;//1
        byte bytedois =  (byte) 0b10;//2
        byte bytetres =     (byte) 0b11;//3
        byte bytequatro = (byte) 0b100;//4
        byte bytecinco = (byte) 0b101;//5
        byte byteseis =   (byte) 0b110;//6
        byte bytesete = (byte) 0b111;//7
        byte byteoito = (byte) 0b1000;//8
        
        byte bytenove = (byte) 0b1001;//9
        byte bytedez =  (byte) 0b1010;//10
        byte byteonze = (byte) 0b1011;//11
        byte bytedoze = (byte) 0b1100;//12
        byte byte13 = (byte)   0b1101;//13
        byte byte14 = (byte)   0b1110;//14
        byte byte15 = (byte)   0b1111;//15
        byte byte30 = (byte)   0b11110;//30
        byte byte31 = (byte)   0b11111;//31
        
        // A 16-bit 'short' value:
        short short1 =   (short) 0b10100001_01000101; // -24251 => 0b + 16 digitos + underscore.
        short short1_1 = (short) 0b1010000101000101; //-24251 => 0b + 16 digitos SEM underscore.
        short short2 =   (short) 0b1010000_1_01000101;
        short short3 =   (short) 0b1010000_1_0_1000101;
        short short4 =   (short) 0b1010000_1_0_1_000101;
        short short5 =   (short) 0b1010000_1_01_00_0101;
        short short6 =   (short) 0b1010000_1_010_0_0_1_01;
        short short7 =   (short) 0b1_0_1_0_0_0_0_1_01_0_0_0_1_0_1;//-> Pode ter quantos underscore quiser.
        
        //short short8 = (short) 0_b1_0_1_0_0_0_0_1_0_1_0_0_0_1_0_1;//Underscores have to be located within digits
        // short short9 = (short) 0b_1010000_1_01000101;//Underscores have to be located within digits
        
        // Some 32-bit 'int' values:
        int int1 = 0b10100001_01000101_10100001_01000101;  // -1589272251 => 0b + 32 digitos + underscores.
        int int2 = 0b101; // 5
        int int3 = 0B101; // The B in literal can be upper/lower case.  //5
        int int4 = 0B00000000_00000000_00000000_00000101; // The B in literal can be upper/lower case.  //5 =>0b000 + 32 digitos
       
        // A 64-bit 'long' value. Note the "L" suffix:
        long long1 = 0b1010000101000101101000010100010110100001010001011010000101000101L; // -6825872339779608251 => 0b + 64 digitos + sufixo L.
        long long2 = 0b0000000_000000000_00000000_00000000_00000000_00000000_00000000_00000101; // -6825872339779608251 => 0b + 64 digitos.
        long long3 = 0b0000000000000000000000000000000000000000000000000000000000000101;
        System.out.println("byte1=" + byte1);
        System.out.println("byte2=" + byte2);
        System.out.println("byte3=" + byte3);

        System.out.println("short1=" + short1);

        System.out.println("int1=" + int1);
        System.out.println("int2=" + int2);
        System.out.println("int3=" + int3);
        System.out.println("int4=" + int3);

        System.out.println("long1=" + long1);
        System.out.println("long2=" + long2);
    }

}