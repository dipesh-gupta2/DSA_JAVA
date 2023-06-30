package aadi;

public class More_examples {
    public static void main(String[] args) {
//    String msg =greet();
//        System.out.println(msg);
//      int ans =sum3(20,30);
//        System.out.println(ans);
       String addString= val("hey buddy love you","nooo");
        System.out.println(addString);
    }

    ////////////////////////////


    static String greet(){
        return "hey welcome here";
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
    static String val(String a,String b){
        return a+"  "+b;
    }
}
