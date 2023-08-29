public class missingPositive {
    public static void main(String[] args) {
      int[] nums= {1};
      int num=firstMissingPositive(nums);
        System.out.println(num);
    }
    static int firstMissingPositive(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            while(nums[i]-1!=i) {
                if(nums[i]<1){
                    break;
                } else if (nums[i]>nums.length) {
                    break;

                } else{
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length;
    }
}
