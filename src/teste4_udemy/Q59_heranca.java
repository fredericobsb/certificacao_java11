package teste4_udemy;

abstract class Animal {
    private String name;
    
    //Animal(){}
    
    Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
 
class Dogg extends Animal {
    private String breed;
 
    Dogg(String breed) {
        this.breed = breed;
    }
    
    Dogg(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
}
 
public class Q59_heranca {
    public static void main(String[] args) {
        Dogg dog1 = new Dogg("Beagle");
        Dogg dog2 = new Dogg("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + 
                                dog2.getName() + ":" + dog2.getBreed());
    }
}
