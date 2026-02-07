package a_Fundamentals;

import java.util.Arrays;

public class f_LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
}
