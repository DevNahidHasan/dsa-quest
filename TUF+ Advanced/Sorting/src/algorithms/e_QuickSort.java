package algorithms;

public class e_QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] sortedArr = quickSort(arr);

        System.out.println("After Sorting Array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    // Function to perform quick sort
    public static int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    // Helper function to perform recursive quicksort
    public static void quickSortHelper(int[] arr, int low, int high){
        if ( low < high){
            int pIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pIndex - 1);
            quickSortHelper(arr, pIndex + 1, high);
        }
    }

    // Function to partition the array
    public static int partition(int[] arr, int low, int high){
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
