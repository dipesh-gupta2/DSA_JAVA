package Linear_Search;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {23,12,45,4,12,111,54,122};
        int target=input.nextInt();
        int value=linear_Search(nums,target);
        System.out.println(value);

    }

    //search in the array: return the index if item is not found
    //otherwise if the item is found return -1
    static int linear_Search(int[] array,int target){
        if(array.length==0){
            return -1;
        }
        for(int index=0;index< array.length;index++){
            if(target==array[index]){
                return index;
            }
        }
        //this line will execute if none of the return statement executed
        //hence i.e. target not found
        return -1;
    }
    static int linear_Search2(int[] array,int target){
      if(array.length==0){
          return -1;
      }
      for(int index=0;index<array.length;index++){
          if(array[index]==target){
              return array[index];
          }
      }
      return Integer.MAX_VALUE;
    };
    static boolean linearSearchBoolean(int[] array,int target){
        if(array.length==0){
            return false;
        }
        for(int index=0;index<array.length;index++){
            if(array[index]==target){
                return true;
            }
        }
        return false;
    }
}
