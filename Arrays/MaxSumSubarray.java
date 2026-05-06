/*
Problem: Maximum Sum of Sub-Array
Time Complexity: O(n^3)
Space Complexity : O(1)

Approach:
Traverse the array and calculate the current sum and update maximum sum if greater
Return the maximum sum.
*/


import java.util.*;

public class MaxSumSubarray {

    // function to calculate max sum
    public static int maxSum(int arr[]){
        int max = Integer.MIN_VALUE;                  // -infinity
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int currSum = 0;
                for(int k = i; k<=j;k++){
                    currSum += arr[k];
                }
                if(currSum > max){
                    max = currSum;
                }
            }
        }
        return max;
    }

    // main function
    public static void main(String[] args){
        int arr[] = {1,2,3,-2,5};
        System.out.println("Maximum sum of a subarray is : " + maxSum(arr));
    }
    
}
