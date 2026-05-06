/*
Problem: Trapping Rainwater
Time Complexity: O(n)
Space Complexity : O(1)

Approach:
Use a two-pointer approach to move inward from both ends, 
calculating trapped water at each step by subtracting the current height from the maximum height seen so far on the shorter side.
Return the trapped water.
*/


import java.util.*;

public class trappingRainwater {

    // function to calculate trapped water
    public static int trappedWater(int height[]){
        int n = height.length;
        // left maximum height of the bar
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // right maximum height of the bar 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0 ; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int waterTrapped = 0;

        // loop to calculate the waterLevel and Trapped water..
        for(int i = 0; i<n ; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += (waterlevel - height[i]);
        }
        return waterTrapped;
    }

    // main function
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int waterTrapped = trappedWater(height);
        System.out.println("The water trapped in these bar : " + waterTrapped);
    }
}
