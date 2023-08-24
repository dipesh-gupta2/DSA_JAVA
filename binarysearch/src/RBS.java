public class RBS {
    public static void main(String[] args) {
        int[] arr ={3,1};
        int pivotelement=pivot(arr);
        System.out.println(pivotelement);
    }

    static int search(int[] nums, int target) {
        int pivotElement=pivot(nums);
        if(target==nums[pivotElement]){
            return pivotElement;
        }
        else if(target<nums[0]){
            return binarySearch(nums,target,pivotElement+1,nums.length-1);
        }
        else{
            return binarySearch(nums,target,0,pivotElement-1);
        }
    }
    static int binarySearch(int[] arr,int target,int start, int end){
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
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //conditions to find the pivot point
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int pivotDuplicateElements(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //conditions to find the pivot point
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if the elements at middle, start, end are equal then just skip the duplicate
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot??
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++ ;
                //check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;

            }else{
                end =mid-1;
            }
        }
        return -1;
    }
}
