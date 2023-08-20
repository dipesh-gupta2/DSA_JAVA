public class PeakIndex {
    public static void main(String[] args) {
    int[] arr={1,2,4,5,7,8,10,9,8,7,5,3,1};
    int peakIndex=peakIndexInMountainArray(arr);
        System.out.println(peakIndex);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
