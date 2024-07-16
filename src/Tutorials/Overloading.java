package src.Tutorials;

public class Overloading {

    static void add(int sum1){
        System.out.println(sum1);
    }

    static void add(int sum2,int sum3){
        System.out.println("2 inputs " +sum2 +" second" +sum3);
    }

    public static void main(String[] args) {
        add(12);
        add(12,13);
    }
}
