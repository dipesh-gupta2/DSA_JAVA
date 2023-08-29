import java.util.ArrayList;
import java.util.List;

public class DisappearNumber {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> output=findDisappearedNumbers(nums);
        System.out.println(output);

    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
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
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==i+1){
                continue;
            }
            else{
                list.add(i+1);
            }
        }
        return list;
    }
}
