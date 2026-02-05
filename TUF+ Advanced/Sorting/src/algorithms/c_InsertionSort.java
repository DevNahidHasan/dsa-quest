package algorithms;

import java.util.Arrays;

public class c_InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 4, 1, 1};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertionSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i <= n -1; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
