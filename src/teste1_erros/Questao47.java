package teste1_erros;

/*
 * Currently above code causes compilation error.

   Which of the options can successfully print TEXT,25 on to the console?
 * */

class Document {
    int pages;
    Document(int pages) {
        this.pages = pages;
    }
    
}
 
class Word extends Document {
    String type;
    Word(String type) {
        super(20); //default pages
       /*INSERT 1*/
    }
    
    Word(int pages, String type) {
    	/*INSERT 2*/
        super.pages = pages;
    }
}
 
public class Questao47 {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");
        System.out.println(String.join(",", obj.type, obj.pages + ""));
    }
}
