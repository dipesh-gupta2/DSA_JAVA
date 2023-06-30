package aadi;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting two values and the no. of fibonacci numbers you want");
        int a = input.nextInt();
        int b= input.nextInt();
        int n =input.nextInt();

        System.out.print(a+" "+b);

        for (int i=0; i<n;i++){
            int next =a+b;
            System.out.print(" "+next);
            a=b;
            b=next;

        }
    }
}
