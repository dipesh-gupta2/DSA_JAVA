public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-13,-11,-8,-3,0,1,2,54,66,76,84};
        int index_obt=binarySearch(arr,84);
        System.out.println(index_obt);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
       int start=0;
       int end=arr.length -1;
       while(start<=end){
       //find the middle element
       // int mid =(start+end) /2 ; it might be possible that (start+end) might exceed the limit
       int mid =start +(end -start)/2;
       if (target<arr[mid]){
           end=mid-1;
       }
       else if(target>arr[mid]){
           start= mid+1;
       }
       else{
           return mid;
       }

       }
        return -1;
    };
}
