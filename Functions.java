import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number one :");
        int sum1=in.nextInt();
        System.out.println("Enter number two :");
        int sum2=in.nextInt();
        int Sum=sum1+sum2;
        System.out.println("Addition of these 2 numbers is :\n"+Sum);

    }
}
