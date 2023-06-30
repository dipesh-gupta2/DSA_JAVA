package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0]=21;
//        arr[4]=123;
//
//        System.out.println(arr[2]);
//            for(int i=0;i<arr.length;i++){
//                arr[i]=in.nextInt();
//            }
//        for (int j : arr) {
//            System.out.println(j);

//        }


        //arrays of Objects
        String[] str;
        str= new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.print(Arrays.toString(str));
    }
}
