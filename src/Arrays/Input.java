package src.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //Array of primitives
        int[] arr= new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 45;
//        arr[3] = 34;
//        arr[4] = 64;
        //[23,45,45,34,64]
        //System.out.println(arr[3]);

        //input using for loops
//        for (int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }

        System.out.println(Arrays.toString(arr));
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
//
//        for (int num : arr){//for every element in array print the element
//            System.out.println(num + " ");// here num represents element of the array
//        }


        //array of objects
        String[] str=new String[4];
        for (int i=0;i< str.length;i++){
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));

        //modity
        str[1] = "arnav";

        System.out.println(Arrays.toString(str));
    }
}
