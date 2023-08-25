import java.util.Arrays;

public class SelectionSortMax {
    public static void main(String[] args) {
        int[] arr={1,43,54,12,546,1,54,67,2,4,653};
        System.out.println(Arrays.toString(arr));
        SelectionSortMax(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSortMax(int[] arr){
        int end=arr.length-1;
        for(int i=end;i>0;i--){
            int newPosition=findLargest(arr,i);
            int temp=arr[i];
            arr[i]=arr[newPosition];
            arr[newPosition]=temp;
        }
    }

    static int findLargest(int[] arr,int end){
        int max=0,maxIndex=0;
        for(int i=0;i<=end;i++){
            if(max<arr[i]){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
