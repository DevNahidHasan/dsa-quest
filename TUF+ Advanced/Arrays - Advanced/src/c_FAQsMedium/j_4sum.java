package c_FAQsMedium;

import java.util.*;

public class j_4sum {
    public static void main(String[] args) {

    }
    /*
Complexity Analysis -
Time Complexity: O(N4) for using 4 nested loops, where N is size of the array.

Space Complexity: O(2 x no. of the quadruplets), for using a set data structure and a list to store the quads.
    */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //size of the array
        int n = nums.length;

        // Set to store unique quadruplets
        Set<List<Integer>> set = new HashSet<>();

        // Checking all possible quadruplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        // Calculate the sum of the current quadruplet
                        long sum = nums[i] + nums[j] + nums[k] + nums[l];

                        // Check if the sum matches the target
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            // Sort the quadruplet to ensure uniqueness
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }

        // Convert set to list (unique quadruplets)
        return new ArrayList<>(set);
    }
}
