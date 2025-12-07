package Array;

public class stockBuySell {
    public static int BuySell(int []arr){

        int buy = Integer.MAX_VALUE;
         int profit = 0;

         for(int price : arr){
             if (price < buy){
                 buy = price;
             } else if (price - buy > profit) {
                 profit = price - buy;
             }
         }
        System.out.println( "the profit is " + profit);
                return profit;
    }

    public static void main(String[]args){
        int [] arr = {7,6,4,3,10};
        BuySell(arr);
    }
}
