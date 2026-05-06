/*
Problem: Reverse an Array
Time Complexity: O(n)
Space Complexity: O(1)

Approach:
Traverse the half of array and swap the first elements with last without creating and extra array.
*/



public class ReverseArray {

    // function to reverse the array
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // main function
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        reverse(arr);
        System.out.println("\nReversed array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
