package c_FAQsMedium;

import java.util.Arrays;

public class k_SortAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 1, 0, 2};

//        sortZeroOneTwo(nums);
        sortZeroOneTwo2(nums);

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
/*
Optimal Solution -

Complexity Analysis -
Time Complexity: O(N), where N is the size of the array, as there is single traversal of the array.

Space Complexity: O(1), no extra space is used.
 */
    public static void sortZeroOneTwo2(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while ( mid <= high ) {
            if (nums[mid] == 0) {
                /* Swap nums[low] and nums[mid], then
                move both low and mid-pointers forward*/
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                /* Swap nums[mid] and nums[high],
                then move high pointer backward*/

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
