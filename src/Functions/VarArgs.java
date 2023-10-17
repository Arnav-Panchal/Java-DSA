package src.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,667,8,9,75);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
