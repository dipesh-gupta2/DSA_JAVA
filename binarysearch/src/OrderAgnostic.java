import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr1={1,12,15,21,24,25,29,35,39,45,49};
        int[] arr2={49,48,38,36,34,31,28,27,12,5,2,1,-2,-12,-13};
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int ans=orderAgnosticBS(arr1,target);
        int ans2=orderAgnosticBS(arr2,target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length -1;
        boolean isAsc=arr[start]<arr[end];
        if(isAsc){
            while(start<=end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        else{
            while(start<=end){
                int mid=start + (end-start)/2;
                if(target<arr[mid]){
                    start=mid+1;
                }

                else if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    };
};
