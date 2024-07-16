package src.Tutorials;
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog1 extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog1();
        a.makeSound();  // Outputs: Bark
        // a.fetch();   // This line would cause a compile-time error because fetch() is not a method of Animal
    }
}

