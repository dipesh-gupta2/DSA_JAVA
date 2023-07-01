package Linear_Search;

import java.util.Scanner;

public class SearchinStrings  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name= input.next();
        char target=input.next().charAt(0);

        boolean isInString=searchString(name,target);
        System.out.println(isInString);
    }
    static boolean searchString(String str,char target){
       if(str.length()==0){
           return false;
       }
       for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
       }
       return false;
    }
}
