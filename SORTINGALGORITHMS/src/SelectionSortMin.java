import java.util.Arrays;

public class SelectionSortMin {
    public static void main(String[] args) {
        int[] arr={1,24,12,4,54,25,145,6,2,543,12,22,1};
        System.out.println(Arrays.toString(arr));
        SelectionSortMin(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSortMin(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int newPosition=findSmallest(arr,i);
            int temp=arr[i];
            arr[i]=arr[newPosition];
            arr[newPosition]=temp;
        }
    }
    static int findSmallest(int[] arr,int start){
        int min=arr[start],minIndex=0;
        for(int i=start;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
}
