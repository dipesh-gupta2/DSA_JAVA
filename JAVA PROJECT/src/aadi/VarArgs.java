package aadi;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(2,3,4,5232,43,12);
        multiple(2,4,"aditya","aadi","aewes");
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a+b);
    }
}
