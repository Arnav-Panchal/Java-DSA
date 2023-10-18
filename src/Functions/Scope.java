import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=10;
        int b=20;
        {
            a = 45;//we can definatly change the value of pre initialised variable
            int c = 23;// already initialised outside the block in the same method , hence you cnnot initialised it again
            //variable initialised within the block cannot be used outside the block and the variable initialised outside the block can be changed inside the block
        }
        int c ;//the same variable can be initialised if the variable is initialised within the block
        System.out.println(a);
    }

    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
