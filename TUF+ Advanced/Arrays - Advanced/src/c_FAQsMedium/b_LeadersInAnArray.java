package c_FAQsMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b_LeadersInAnArray {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};

        // Get leaders using class method
        List<Integer> ans = leaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }

    // Optimal Solution
    /*
        Complexity Analysis -

        Time Complexity:O(N), for single traversal of array , where N is the length of that array.

        Space Complexity: O(1), as extra space to store answer is not considered.

     */
    public static List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        // Last element of the array is always a leader
        int max = nums[n-1];
        list.add(max);

        // Check elements from right to left
        for (int i = n - 2; i >= 0; i--){
            if (nums[i] > max){
                max = nums[i];
                list.add(max);
            }
        }

        /* Reverse the list to match
        the required output order */
        Collections.reverse(list);

        // Return the leaders
        return list;
    }
}
