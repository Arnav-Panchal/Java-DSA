package src.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

//        fun(2,3,4,5,667,8,9,75);
        multiple(2,3,"Arnav","Panchal");
        demo(12,45);
    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){

        System.out.println(Arrays.toString(v));
    }
}
