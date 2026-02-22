package c_FAQsMedium;

public class i_2sum {
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        // Call the twoSum method to find the indices
        int[] ans = twoSum(nums, target);

        // Print the result
        System.out.println("This is the answer: [" + ans[0] + ", " + ans[1] + "]");
    }
/*
Complexity Analysis -
Time Complexity:O(N^2), For using two nested loops to traverse the array, where N is the length of that array.

Space Complexity: O(1), not using extra space.
*/
    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        //create ans array to store ans
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                /* if nums[i] + nums[j] is equal to
                   target put i and j in ans */
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }

            }
        }

        // Return {-1, -1} if no such pair is found
        return new int[]{-1, -1};
    }
}
