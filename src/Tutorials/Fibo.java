package src.Tutorials;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();

        int a = 0;
        int b = 1;

        for(int count = 2 ; count<=n ; count++){
            int temp=b;
            b=a+b;
            a=temp;
        }

        System.out.println("The nth place fibonacci number is : " + b);






    }
}
