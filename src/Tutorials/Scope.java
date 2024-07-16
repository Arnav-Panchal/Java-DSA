package src.Tutorials;


import java.util.Arrays;

public class Scope {

    static int a=10;


    public static void main(String[] args) {
        System.out.println(a);
        int a=90;
        System.out.println(a);

    }



}
