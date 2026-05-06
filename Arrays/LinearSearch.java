/*
Problem: Linear Search
Time Complexity: O(n)
Space Complexity: O(1)

Approach:
Traverse the array and check each element.
If found the target, return index.
*/

import java.util.*;

public class linearSearch{

    // Linear Search function 
    public static int linear_Search(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // main function
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int ans = linear_Search(arr, target);

        if(ans == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index : "+ ans);
        }
    }

}

