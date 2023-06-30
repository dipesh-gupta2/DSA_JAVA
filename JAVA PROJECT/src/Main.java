import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("hello world");
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter some input: ");
//        int rollno=input.nextInt();
//        System.out.println("Your roll number is:"+rollno);
        String name =input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}