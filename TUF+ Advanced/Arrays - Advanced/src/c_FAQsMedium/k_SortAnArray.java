package c_FAQsMedium;

import java.util.Arrays;

public class k_SortAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 1, 0, 2};

        sortZeroOneTwo(nums);

        // Print the array elements
        System.out.println(Arrays.toString(nums));
    }
/*
Brute Force Solution -

Complexity Analysis -
Time Complexity: O(NxlogN), where N is the size of the array. As the optimal sorting take O(N * logN) time.

Space Complexity: O(1) no extra space is used to solve the problem.
 */
    public static void sortZeroOneTwo(int[] nums) {
        // Sort the array using Arrays.sort
        Arrays.sort(nums);
    }
}
