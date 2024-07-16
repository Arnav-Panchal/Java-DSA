package src.Tutorials;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String fruit = n.nextLine();


        switch (fruit){
            case "Mango" :
                System.out.println("The fruit is mango");
                break;
            case "Apple" :
                System.out.println("THe fruit is Apple");
                break;
            case "Grapes" :
                System.out.println("The fruit is Grape");
                break;
            case "Orange" :
                System.out.println("The fruit is Orange");
                break;
            case "Chery" :
                System.out.println("THe fruit is Chery");
                break;
            case "Banana" :
                System.out.println("The fruit is Banana");
                break;
            default:
                System.out.println("Enter Valid Input");
        }

    }
}
