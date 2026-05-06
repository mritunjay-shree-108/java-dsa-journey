/*
Problem: Linear Search
Time Complexity: O(logn)
Space Complexity: O(1)

Approach:
Use divide and conquor approach on the given array, 
if target is greater then mid value then search in the part which is greater than mid and vice versa.
If found, return index.
*/




public class binarySearch {

    // binary Search function
    public static int binSearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    // main function
    public static void main(String[] args){
        int arr[] = {1,2,4,6,8,10,25,28,29,31};
        int target = 31;
        int result = binSearch(arr, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found");
        }
    }

}
