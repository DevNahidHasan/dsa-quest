package algorithms;

import java.util.ArrayList;
import java.util.List;

public class d_MergeSorting {
    public static void main(String[] args) {
//        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int[] arr = {14, 7, 3, 12};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int[] sortedArr = mergeSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(sortedArr[i] + " ");
        System.out.println();
    }

    // Function to perform merge sort on the given array
    public static int[] mergeSort(int[] nums) {
        int n = nums.length; // Size of array

        // Perform Merge sort on the whole array
        mergeSortHelper(nums, 0, n - 1);

        // Return the sorted array
        return nums;
    }

    static void mergeSortHelper(int[] arr, int low, int high) {
        //Base case: if the array has only one element then low will be same as high
        if ( low >= high){
            return;
        }

        //Find the middle index
        int mid = (low + high) / 2;

        //Sort the left half
        mergeSortHelper(arr,low,mid);
        //sort the right half
        mergeSortHelper(arr,mid+1,high);

        //merge the sorted halves
        merge(arr,low,mid,high);
    }

    // Function to merge two sorted halves of the array
    static void merge(int[] arr, int low, int mid, int high){
        // Temporary list to store the merged elements
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Loop until one of the sorted halves are exhausted
        while (left <= mid && right <= high){
            // compare left and right elements
            if ( arr[left] <= arr[right]){
                // Add left element to temp
                temp.add(arr[left]);
                // Move the left pointer
                left++;
            }else{
                // Add element to temp
                temp.add(arr[right]);
                // Move right pointer
                right++;
            }
        }

        // If there is remaining elements in left half -> add them
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        // If there is remaining elements in right half -> add them
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        // Transferring the sorted elements to arr
        for ( int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

}
