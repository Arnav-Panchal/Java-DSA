package src.Tutorials;

public class Child extends Parent{

    public static void main(String[] args) {
        Child sayali=new Child();

        sayali.a=12;
        sayali.surname="Korhale";
        sayali.addr="Narayangaon";
        System.out.println(sayali.a + sayali.surname);

        sayali.display();

    }
}
