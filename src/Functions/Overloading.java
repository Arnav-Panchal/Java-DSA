package src.Functions;

public class Overloading {//method overloading is were the arguments or parameters passed inside the function determines which method will be called
    public static void main(String[] args) {
       // fun("Arnav Panchal");
        fun(12);
        int ans=sum(3,4,5);
        System.out.println(ans);
    }

    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("second one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("first one");
        System.out.println(name);
    }
}
