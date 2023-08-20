// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,7,9,10,12,89,90,100,130,140,150,160,170};
        int target=140;
        int position =position_infinite(arr,target);
        System.out.println(position);
    }
    static int position_infinite(int[] arr, int target){
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target> arr[end]){
            int temp=end+1; //this is the new start
            //double the box value
            //end =previous end +sizeofbox*2
            end =end +(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    };
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<mid){
              end=mid-1;
            }
            else if(target>mid){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    };
}
