import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr ={1,3,2,5,3,6};
        change(arr);
        System.out.println(Arrays.toString(arr));//this command is used to print the whole array at once as a string
    }

    static void change(int[] nums){
        nums[0]=99;//if ytou make a change to the object via this ref variable same object will be changed
    }
}
