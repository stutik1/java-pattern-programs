package oops;

interface Animal {
    // Method signatures (implicitly public and abstract)
    void makeSound();
    void eat();
}

// Implement the Animal interface in classes
class Dog implements Animal {

     public void makeSound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat eats fish");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call methods
        dog.makeSound();
        dog.eat();
        cat.makeSound();
        cat.eat();
    }
}

