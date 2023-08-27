import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={-1,0};
        int[] twosum=twoSum(arr,-1);
        System.out.println(Arrays.toString(twosum));

    }
    static int[] twoSum(int[] numbers, int target) {
        int[] indexes = {-1, -1};
        int value1 = 0;
        int value2 = 0;
        int i;
        for (i = 0; i < numbers.length - 1; i++){
           value1=target-numbers[i];

            value2 = binarySearch(numbers, i+1, value1);

            if(value2!=-1){
                indexes[0]=i+1;
                indexes[1]=value2+1;
            }
            else{
                continue;
            }
        }

        return indexes;
    }
    static int binarySearch(int[] arr,int start,int target){
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
