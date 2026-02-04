package algorithms;

import java.util.Arrays;

public class a_SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7, 5, 9, 2, 8};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n-2; i++){
            int minIndex = i;
            for (int j = i + 1; j <= n-1; j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }
}
