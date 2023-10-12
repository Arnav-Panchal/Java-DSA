import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        suma();
    }

    static void suma(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number one :");
        int sum1=in.nextInt();
        System.out.println("Enter number two :");
        int sum2=in.nextInt();
        int Sum=sum1+sum2;
        System.out.println("Addition of these 2 numbers is :\n"+Sum);
    }
}
