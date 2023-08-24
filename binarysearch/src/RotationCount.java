public class RotationCount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        System.out.println(findKRotation(arr));
    }
    static int findKRotation(int[] arr) {
        int pivotPoint=findPivot(arr);
        if(pivotPoint==-1){
            return 0;
        }
        else{
            return pivotPoint+1;
        }
    };
    static int findPivot(int[] arr){
        int start=0;
        int end =arr.length -1;
        while(start<=end){
            int mid=start+(end-start)/2;
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
}
