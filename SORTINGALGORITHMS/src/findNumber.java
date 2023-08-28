public class findNumber {
    public static void main(String[] args) {
    int[] arr={1,5,3,2,0,6};
    int missingNumber=missingNumber(arr);
        System.out.println(missingNumber);
    }
    static int missingNumber(int[] nums){
        cyclicSort(nums);
        int i=0;
        while(i<=nums.length){
            if(nums[i]!=i){
                return i;
            }
            else{
                i++;
            }
        }
        return nums.length;
    }
    static void cyclicSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i){
                if(arr[i]==arr.length){
                    break;
                }
                else{
                    int temp=arr[arr[i]];
                    arr[arr[i]]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
