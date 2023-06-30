package aadi;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter the temp. in Celsius");
        float cel = input.nextFloat();
        float kel = (cel*9/5)+32;
        System.out.println("The temperature is: "+kel);
    }
}
