import java.util.Arrays;

public class BUBBLESORT {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(newArr));
    }
    static void bubbleSort(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<arr.length-1){
            int count=0;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    count++;
                }
            }
            i++;
            n--;
            if(count==0){
                break;
            }
        }

    }
}
