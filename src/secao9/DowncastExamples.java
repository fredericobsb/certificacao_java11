package secao9;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Utilize polymorphism to cast and call methods
Sub-Topic: downcasting
*/

// Animal is our base class
class Animal2 {
    public void printAnimal() {
        System.out.println("I am an animal");
    }
}

// Dog is a subclass of Animal
class Dog2 extends Animal2 {
    public void printDog() {
        System.out.println("I am a dog");
    }
}

// Cat is also a subclass of Animal
class Cat2 extends Animal2 {
    public void printCat() {
        System.out.println("I am a cat");
    }
}

public class DowncastExamples {
    public static void main(String[] args) {
        DowncastExamples dex = new DowncastExamples();

        // We create instances of Dog and Cat but assign them to
        // variables of type Animal
        Animal2 genericDog = new Dog2();
        Animal2 genericCat = new Cat2();

        // We cast now:
        dex.testDog((Dog2) genericDog);
        dex.testCat((Cat2) genericCat);

        // Try the overloaded methods with
        // specifically typed variables.
        dex.testAnimal((Dog2) genericDog);
        dex.testAnimal((Cat2) genericCat);

        // Try the overloaded methods with
        // generically typed variables.
        dex.testAnimal(genericDog);
        dex.testAnimal(genericCat);
    }

    //Three Overloaded methods
    public void testAnimal(Animal2 animal2) {
        System.out.println("Executing testAnimal with Animal type");
        animal2.printAnimal();
    }

    public void testAnimal(Cat2 cat2) {
        System.out.println("Executing testAnimal with Cat type");
        cat2.printAnimal();
    }

    public void testAnimal(Dog2 dog2) {
        System.out.println("Executing testAnimal with Dog type");
        dog2.printAnimal();
    }

    // Specifically Typed method calls
    public void testDog(Dog2 dog2) {
        dog2.printDog();
    }

    public void testCat(Cat2 cat2) {
        cat2.printCat();
    }
}
