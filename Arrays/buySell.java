/*
Problem: Buy & Sell Stock
Time Complexity: O(n)
Space Complexity: O(1)

Approach:
Update the maximum profit by subtracting the minimum price seen so far from the current price as you iterate through the list once.
*/


public class buySell {

    // function to calculate the maximum profit 
    public static int maxProfit(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    // main function 
    public static void main(String[] args){
        int price[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit is : " + maxProfit(price));
    }
}
