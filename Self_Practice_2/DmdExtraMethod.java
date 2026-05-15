class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog runs fast");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    void climb() {
        System.out.println("Cat climbs tree");
    }
}

public class DmdExtraMethod
 {
    public static void main(String[] args) {

        Animal a;   // Parent reference eita nitesi

        a = new Dog();     // Upcasting hoitese eikhane
        a.makeSound();     // DMD ..dog er method run korbe eine

        Dog d = (Dog) a;   // Downcasting hoitese
        d.run();           // Dog specific method run hbe....

        a = new Cat();     
        a.makeSound();     
        Cat c = (Cat) a;   
        c.climb();        
    }
}
