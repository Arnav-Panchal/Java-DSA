package src.Tutorials;
import java.util.Scanner;
public class Problems {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int a =input.nextInt();

        int b ;

        b = 59 ;


         switch(a){
             case 5:
                 System.out.println("The a is 5");
                 break;

             case 10:
                 System.out.println("The a is 10");
                 break;
             case 15:
                 System.out.println("The a is 15");
                 break;
             case 20:
                 System.out.println("The a is 20");
                 break;
             case 25:
                 System.out.println("The a is 25");
                 break;
             case 30:
                 System.out.println("The a is 30");
                 break;
             default:
                 System.out.println("Enter Valid Input");
         }


    }
}
