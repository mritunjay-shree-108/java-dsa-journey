/*
Problem: Largest Number in an Array
Time Complexity: O(n)
Space Complexity: O(1)

Approach:
Traverse the array and check each element.
If found, return maximum number.
*/

public class largestNumber {
    // function to find Largest number in array
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;                //-inifinity
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    // main function
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int ans = largest(arr);
        System.out.println("Largest element in the array is : "+ ans);

    }
}
