package teste3_udemy;

class Bookk {
    private String name;
    private String author;
    
    Bookk() {}
    
    Bookk(String name, String author) {
        name = name;
        author = author;
    }
    
    String getName() {
        return name;
    }
    
    String getAuthor() {
        return author;
    }
}
 
public class Q64_construtores_book {
    public static void main(String[] args) {
        private Bookk book = new Bookk("Head First Java", "Kathy Sierra");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
