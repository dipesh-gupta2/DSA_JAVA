//https://leetcode.com/problems/find-the-duplicate-number/submissions/
public class DuplicateinArray {
    public static void main(String[] args) {
        int[] nums={2,1,2};
        int duplicate=findDuplicate(nums);
        System.out.println(duplicate);
    }
    static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]-1!=i){
                if(nums[nums[i]-1]==nums[i]){
                    return nums[i];
                }

                else{
                    int temp=nums[nums[i]-1];
                    nums[nums[i]-1]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        return -1;
    }
}
