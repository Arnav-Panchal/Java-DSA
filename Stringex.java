import java.util.Scanner;

public class Stringex {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.next();
        System.out.println("Enter your surname : ");
        String Surname=in.next();

        String personalised = myGreet(name,Surname);
        System.out.println("Welcome... "+personalised);
    }

    static String myGreet(String care,String free){
        String Fullname = care+" " + free ;
        return Fullname;
    }
    static String greet(){
        String greeting="how are you ?";
        return greeting;
    }
}
