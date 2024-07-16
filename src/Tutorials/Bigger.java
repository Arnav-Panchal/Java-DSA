package src.Tutorials;

import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int a ,b ,c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int max;

        if(a>b){
            max = a;
        }else {
            max = b;
        }

        if(max<c){
            max=c;
        }

        System.out.println("The bigger number is :" + max);




    }
}
