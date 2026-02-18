package c_FAQsMedium;

import java.util.*;

public class i_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(nums);

        // Print the result
        for (List<Integer> triplet : ans) {
            System.out.print("[");
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
/*
Complexity Analyis
Time Complexity: O(N3 x log(no. of unique triplets)), where N is size of the array. Using 3 nested loops & inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.

Space Complexity: O(2 x no. of the unique triplets) for using a set data structure and a list to store the triplets.
 */
    public static List<List<Integer>> threeSum(int[] nums) {
        // Set to store unique triplets
        Set<List<Integer>> tripletSet = new HashSet<>();

        int n = nums.length;

        // Check all possible triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Found a triplet that sums up to target
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        /* Sort the triplet to ensure
                        uniqueness when storing in set*/
                        Collections.sort(temp);
                        tripletSet.add(temp);
                    }
                }
            }
        }

        // Convert set to list of lists (unique triplets)
        List<List<Integer>> ans = new ArrayList<>(tripletSet);

        //Return the ans
        return ans;
    }
}
