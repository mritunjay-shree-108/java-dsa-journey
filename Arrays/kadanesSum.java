/*
Problem: Finding maximum sum of the subArray using KADANE's Algorithm
Time Complexity: O(n)

Approach:
Traverse the array and calculate sum , if the sum is negative make the currentSum = 0 , and do the further calculation.
Return the maximum sum.
This is the optimised approach
*/

import java.util.*; 

public class kadanesSum {

    // function to calculate maximum sum using KADANE's approach
    public static int Kadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // loop (Single loop and most optimised algorithm)
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }

    // main function
    public static void main(String[] args){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum sum of a subarray is : " + Kadane(arr));
    }
}
