import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int anw=suma();
//        System.out.println("Answer :"+anw);
        int ans= sum3(12,12);
        System.out.println("Answer : "+ ans );
    }

    static void suma1(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number one :");
        int sum1=in.nextInt();
        System.out.println("Enter number two :");
        int sum2=in.nextInt();
        int Sum=sum1+sum2;
        System.out.println("Addition of these 2 numbers is :\n"+Sum);
    }

    static int suma(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number one :");
        int sum1=in.nextInt();
        System.out.println("Enter number two :");
        int sum2=in.nextInt();
        int Sum=sum1+sum2;
        return Sum;
        // Any statement after return will never execute or read
    }

    static int sum3(int a,int b){
        int sum =a + b ;
        return sum;
    }
}
