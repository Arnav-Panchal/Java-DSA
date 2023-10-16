import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=10;
        int b=20;
        {
            a = 45;//we can definatly change the value of pre initialised variable
            int c = 23;// already initialised outside the block in the same method , hence you cnnot initialised it again
        }
        System.out.println(a);
    }

    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
