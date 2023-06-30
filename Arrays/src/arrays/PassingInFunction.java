package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums={3,4,65,32,12};
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=122;
    }
}
