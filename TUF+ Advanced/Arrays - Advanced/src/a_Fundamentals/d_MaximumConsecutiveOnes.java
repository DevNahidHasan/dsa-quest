package a_Fundamentals;

public class d_MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        /* Initialize count and max_count
        to track current and maximum consecutive 1s */
        int count = 0;
        int max = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If the current element is 1, increment the count
            if (nums[i] == 1) {
                count++;

                // Update max if current count is greater than max
                max = Math.max(max, count);

            } else {
                // If the current element is 0, reset the count
                count = 0;
            }
        }
        // Return the maximum count of consecutive 1s
        return max;
    }
}
