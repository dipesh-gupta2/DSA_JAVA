package aadi;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int a= input.nextInt();
        int b= input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();

//        int max =a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }

        int max = Math.max(Math.max(a,b),Math.max(c,d));
        System.out.print(max);
    }
}
