//LEETCODE 744: Find Smallest Letter Greater Than Target
public class GreatestLetter {
    public static void main(String[] args) {
    char[] arr={'a','b','d','e'};
    char greatest=nextGreatestLetter(arr,'b');
        System.out.println(greatest);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }

        return (start<=letters.length-1)?letters[start]:letters[0];
    }
}
