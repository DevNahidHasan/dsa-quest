package a_Fundamentals;

import java.util.Arrays;

public class e_LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }
}
