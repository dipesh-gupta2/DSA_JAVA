public class CeilingOfNumber {
    public static void main(String[] args) {
    int[] arr ={1,4,6,7,12,14,16,17,19,22,29,51};
    int ceiling=Ceiling(arr,569);
        System.out.println(ceiling);
    }
    static int Ceiling(int[] arr,int target){
        int start=0;
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

        return (start<=arr.length-1) ? start :-1;
    }
}
