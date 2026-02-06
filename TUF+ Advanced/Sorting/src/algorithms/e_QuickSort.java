package algorithms;

import java.util.Arrays;
import java.util.Random;

public class e_QuickSort {
    public static void main(String[] args) {
//        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
//        int[] arr = {7, 4 , 1, 5, 3};
        int[] arr = {5, 4, 4, 1, 1};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        System.out.println(Arrays.toString(arr));

        quickSort(arr);

        System.out.println("After Sorting Array: ");
        System.out.println(Arrays.toString(arr));

    }

    // Function to perform quick sort
    public static void quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
//        return nums;
    }

    // Helper function to perform recursive quicksort
    public static void quickSortHelper(int[] arr, int low, int high){
        if ( low >= high) {
            return;
        }
            int pIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pIndex - 1);
            quickSortHelper(arr, pIndex + 1, high);

    }

    // Function to partition the array
    public static int partition(int[] arr, int low, int high){
        // Choosing a random index between low and high
        int randomIndex = low + new Random().nextInt(high - low + 1);
        // Swap the random element with the first element
        swap(arr, low, randomIndex);

        int pivot = arr[low];
        int i = low;
        int j = high;

        while ( i < j) {
            while ( arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while ( arr[j] > pivot && j >= low + 1){
                j--;
            }

            // Swap if valid
            if ( i < j){
                swap(arr, i , j);
            }
        }
        // Place pivot in correct position
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
