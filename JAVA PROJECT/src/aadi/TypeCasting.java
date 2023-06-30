package aadi;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        float num = input.nextFloat();

    //Type Casting
    int num =(int) 67.97753f;
    System.out.println(num);

    //Automatic type promotion in expressions
//        int a=254;
//        byte b=(byte)(a); //257%256=1

//        System.out.println(b);
//        byte a =40;
//        byte b =50;
//        byte c =127;
//        int d =a*b/c;
//
//        System.out.print(d);

        int number ='a';
        System.out.println((int) (3*122.563));
    }


}
