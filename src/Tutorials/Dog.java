package src.Tutorials;

public class Dog {
    int age;
    String Breed;
    String color;

    void bark(){
        System.out.println("!Woof");
    }

    public static void main(String[] args) {
        Dog mydog=new Dog();
        Dog dog2=new Dog();

        dog2.Breed="german";
        dog2.age=5;
        dog2.color="white";

        System.out.println(dog2.Breed);
        mydog.Breed="Lambrodore";
        mydog.age=3;
        mydog.color="black";

        System.out.println(mydog.Breed);
        mydog.bark();
    }
}
