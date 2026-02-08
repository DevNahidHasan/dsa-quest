package b_LogicBuilding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class b_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        int[] nums = {0, 0, 3, 3, 5, 6};
        int[] nums = {-2, 2, 4, 4, 4, 4, 5, 5};
//        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates2(nums));
        System.out.println(Arrays.toString(nums));

    }

    //Brute force approach
    public static int removeDuplicates(int[] nums) {

        // TreeSet to store unique elements in sorted order
        Set<Integer> s = new TreeSet<>();

        // Add all elements from array to the set
        for (int val : nums) {
            s.add(val);
        }

        // Get the number of unique elements
        int k = s.size();

        int j = 0;
        // Copy unique elements from set to array
        for (int val : s) {
            nums[j++] = val;
        }

        // Return the number of unique elements
        return k;
    }

    //Optimal approach
    public static int removeDuplicates2(int[] nums){
        int n = nums.length;
        int j = 1;
        int count = 1;
        for (int i = 1; i < n; i++){
            if (nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
                count++;
            }
        }
        return count;
    }
}
