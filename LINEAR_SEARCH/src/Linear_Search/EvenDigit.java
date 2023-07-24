package Linear_Search;

import java.util.Scanner;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigit {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] nums= new int[5];
        nums= new int[]{12, 124, 545, 33, 65};
        int totalnumber=findNumbers(nums);
        System.out.println(totalnumber);

    }
    static int findNumbers(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int temp=nums[i];
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            if(count%2==0){
                total++;
            }
        }
        return total;
    }
}
