package aadi;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int num=input.nextInt();
    boolean check=isPrime(num);
    System.out.println(check);
    }
    static boolean isPrime(int num){
        int count =0;
        if(num<=1){
            return false;
        }
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    count=count+1;
                    break;
                }

            }
        }
        if(count!=0){
            return false;
        }
        else{
            return true;
        }
    }
}
