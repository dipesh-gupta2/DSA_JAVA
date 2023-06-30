package aadi;

import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int num=input.nextInt();
        int count=0;
        while(n>0){
            int digit= n%10;
            if(digit==num){
               count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
