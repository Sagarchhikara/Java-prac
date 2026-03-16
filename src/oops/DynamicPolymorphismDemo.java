package oops;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {

    public void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicPolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal;  // reference of type Animal

        myAnimal = new Dog();
        myAnimal.sound(); // calls Dog's sound() at runtime

        myAnimal = new Cat();
        myAnimal.sound(); // calls Cat's sound() at runtime

        // Another example with an array of Animal references
        Animal[] animals = {new Dog(), new Cat(), new Animal()};
        for (Animal a : animals) {
            a.sound();    // polymorphic method call
        }
    }
}
