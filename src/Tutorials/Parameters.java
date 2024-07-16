package src.Tutorials;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String d=in.nextLine();

        Greetings(d);

    }

    static void Greetings(String name){
        System.out.println("Hello "+name);
    }

    static void Add(int num1 , int num2){
        int sum =num1 + num2 ;
        System.out.println("Addition : "+sum);
    }
}
