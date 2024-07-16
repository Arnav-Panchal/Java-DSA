package src.Tutorials;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        add();
        Greeting();
    }

    static int add(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = in.nextInt();
        System.out.print("Enter second number :");
        int b= in.nextInt();

        int sum=a+b;

        return sum;
    }

    static String Greeting (){
        String Msg= "What is your name ";
        return Msg;
    }

}
