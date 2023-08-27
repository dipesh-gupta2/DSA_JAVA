import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,2,1,4,6,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            while(arr[i]-1!=i){
                int temp=arr[arr[i]-1];

                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
