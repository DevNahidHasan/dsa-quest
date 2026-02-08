package b_LogicBuilding;

import java.util.Arrays;

public class a_MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 0, 0, 2};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        // j keeps track of where the next non-zero should be placed
        int j = 0;

        // Loop through all elements
        for (int i = 0; i < nums.length; i++) {
            // If current element is non-zero
            if (nums[i] != 0 ) {
                if (i == j){//no need to swap
                    j++;
                    continue;
                }
                // Swap current element with the one at index j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move j forward
                j++;
            }
        }
    }
}
