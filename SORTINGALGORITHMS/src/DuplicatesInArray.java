//leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> output=findDuplicates(nums);
        System.out.println(output);

    }
    static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<=nums.length-1;i++){
            while(nums[i]-1!=i) {
                if (nums[nums[i] - 1] == nums[i]) {
                    break;
                } else {
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1!=i){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
