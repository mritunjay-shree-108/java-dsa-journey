/*
Problem: Best Time to Buy and Sell Stock

Category: Arrays

Approach:
Track minimum price so far and calculate profit at each step.

Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: [7,1,5,3,6,4]
Output: 5
*/


public class BuySellStock {

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
