package src.Arrays;

public class Main {
    public static void main(String[] args) {
        //Q:store a rool no
        int a=19;
        //Q: store a persons name
        String name="arnav panchal";
        //Q: store five roll no
        int rno1=23;
        int rno2=34;
        int rno3=35;

        //syntax
        //datatype[] variable name = new datatype[size];
        //store 5 roll no numbers;
//
//    int[] rnos=new int[5];
//    // or directly
//    int[] rnos2={23,12,45,32,15};
        int[] ros3;// declaration of array . ros is gettting defined in the stack
        ros3 = new int[5];//initialisation : actually here object is being created in heap memory

        System.out.println(ros3[1]);

        String[] arr=new String[4];
        System.out.println(arr[0]);
        // by default the reference variable shows the value of any variable to be null
//        String str=null;//we can assign null to non primitives only
//        int num=null;//we cannot assign null to primitive values



    }


}
