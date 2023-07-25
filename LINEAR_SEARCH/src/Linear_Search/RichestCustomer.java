package Linear_Search;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts= {{1,2,3},{3,2,9}};
        int maxWealth=maximumWealth(accounts);
        System.out.println(maxWealth);
    }
    static int maximumWealth(int[][] accounts) {
       int max=0;
       for(int i=0;i<accounts.length;i++){
           if(max<wealth(accounts[i])){
               max=wealth(accounts[i]);
           }
       };
       return max;
    };
    static int wealth(int[] account){
        int sum=0;
      for (int i=0;i<account.length;i++){
          sum+=account[i];
      }
      return sum;
    };

}
