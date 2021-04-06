package teste1_erros;

interface Document {
    default String getType() {
        return "TEXT";
    }
}
 
interface WordDocument extends Document {
    String getType();
}
 
class Word implements WordDocument {}
 
public class Questao82 {
    public static void main(String[] args) {
        Document doc = new Word(); //Line n1
        System.out.println(doc.getType()); //Line n2
    }
}

/*
 * EXPLICACAO:
 * 
 * As per Java 8, default methods were added in the interface.

Interface Document defines default method getType(), there is no compilation error in interface Document. Method getType() is implicitly public in Document.

Interface WordDocument extends Document and it overrides the default method getType() of Document, overriding method in WordDocument is implicitly abstract and public. An interface in java can override the default method of super type with abstract modifier. Interface WordDocument compiles successfully.

Class Word implements WordDocument and as WordDocument interface has abstract method getType(), and as class Word doesn't implement the getType() method hence it causes compilation failure.
 * */
