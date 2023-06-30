package arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(65);
        list.set(0,122);
       System.out.println(list);
    }
}
