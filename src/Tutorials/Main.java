package src.Tutorials;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();

        if(a<=10){
            System.out.println("Value of a is smaller than 10");
        } else if (a<=15) {
            System.out.println("Value of a is smaller than 15");
        } else if (a<=25) {
            System.out.println("Value of a is smaller than 25");
        } else{
            System.out.println("Does not satisfy any condition");
        }
    }
}
