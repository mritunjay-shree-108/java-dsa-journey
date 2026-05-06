/*
Problem: Finding max sum using Prefix Sum approach
Time Complexity: O(n^2)
Space Complexity : O(1)

Approach:
Traverse the array and check each element.
Return the maximum sum.
*/


import java.util.*;

public class prefixSum {

    // function to find the maximum sum using prefix sum approah
    public static int preSum(int arr[]){
        int max = Integer.MIN_VALUE;                                  // -infinity

        // calculating prefix array 
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // loop to find the max sum 
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length;j++){
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
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
        System.out.println("Maximum sum of a subarray is : " + preSum(arr));
    }
}
