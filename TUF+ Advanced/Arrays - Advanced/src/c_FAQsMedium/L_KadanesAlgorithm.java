package c_FAQsMedium;

public class L_KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] arr2 = {-2, -3, -7, -2, -10, -4};

        int maxSum = maxSubArray(arr);
        int maxSum2 = maxSubArray2(arr2);
        int maxSum3 = maxSubArray3(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
        System.out.println("The maximum subarray sum is: " + maxSum2);
        System.out.println("The maximum subarray sum is: " + maxSum3);
    }
/*
Better solution -

Complexity Analysis -

Time Complexity:O(N2), for using two nested loops, each running approximately N times, here N is the size of the array.

Space Complexity: O(1) for not using any extra space.
 */

    public static int maxSubArray(int[] nums) {

        /* Initialize maximum sum with
        the smallest possible integer*/
        int maxi = Integer.MIN_VALUE;

        // Iterate over each starting index of subarrays
        for (int i = 0; i < nums.length; i++) {

            /* Variable to store the sum
            of the current subarray*/
            int sum = 0;

            /* Iterate over each ending index
            of subarrays starting from i*/
            for (int j = i; j < nums.length; j++) {

                /* Add the current element nums[j] to
                the sum i.e. sum of nums[i...j-1]*/
                sum += nums[j];

                /* Update maxi with the maximum of its current
                value and the sum of the current subarray*/
                maxi = Math.max(maxi, sum);
            }
        }

        // Return the maximum subarray sum found
        return maxi;
    }
/*
Optimal Solution -

Complexity Analysis -

Time Complexity: O(N) for single traversal, here N is the size of the array.

Space Complexity: O(1), for not using any extra space.
 */
public static int maxSubArray2(int[] nums) {
    // maximum sum
    long maxi = Long.MIN_VALUE;

    // current sum of subarray
    long sum = 0;

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {

        // Add current element to the sum
        sum += nums[i];

        // Update maxi if current sum is greater
        if (sum > maxi) {
            maxi = sum;
        }

        // Reset sum to 0 if it becomes negative
        if (sum < 0) {
            sum = 0;
        }
    }

    return (int)maxi;
}

/*
Function to find maximum sum of subarrays and print the subarray having maximum sum

    Complexity Analysis -

    Time Complexity: O(N), for using a single loop running N times, where N is the size of the array.

    Space Complexity: O(1), for not using any extra space.
 */
    public static int maxSubArray3(int[] nums) {

        // maximum sum
        long maxi = Long.MIN_VALUE;

        // current sum of subarray
        long sum = 0;

        // starting index of current subarray
        int start = 0;

        // indices of the maximum sum subarray
        int ansStart = -1, ansEnd = -1;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // update starting index if sum is reset
            if (sum == 0) {
                start = i;
            }

            // add current element to the sum
            sum += nums[i];

            /* Update maxi and subarray indices
            if current sum is greater */
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }

        // Printing the subarray
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

        // Return the maximum subarray sum found
        return (int) maxi;
    }
}
