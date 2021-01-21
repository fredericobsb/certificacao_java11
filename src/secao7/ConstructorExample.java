package secao7;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
*/
 
// Create a class - no constructor defined
class ATest {
}
 
// Create a sub class
class BTest extends ATest {
    private String name;
 
    // Constructor has one parameter
    BTest(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
}
 
public class ConstructorExample {
    public static void main(String[] args) {
 
        // Instantiate the object with the one parameter constructor
        BTest btest = new BTest("Jeff");
        System.out.println(btest.getName());
    }
}
