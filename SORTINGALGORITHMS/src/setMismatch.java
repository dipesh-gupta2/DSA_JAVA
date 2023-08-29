import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class setMismatch {
    public static void main(String[] args) {
        int[] nums={1,1};
        int[] errorNums= findErrorNums(nums);
        System.out.println(Arrays.toString(errorNums));
    }
    static int[] findErrorNums(int[] nums) {

        for(int i=0;i<=nums.length-1;i++){
            while(nums[i]-1!=i) {
                if(nums[nums[i]-1] == nums[i]){
                    break;
                }
                else{
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[] {nums[i],i+1};
            }

        }
        return new int[] {-1,-1};
    }
}
