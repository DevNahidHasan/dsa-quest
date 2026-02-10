package b_LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e_IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {2, 3, 3, 4, 5, 7};

        int[] result = intersectionArray(nums1, nums2);

        System.out.println(Arrays.toString(result));

    }

    // Optimal Solution
    /*
        Complexity Analysis-

        Time Complexity: O(M+N), where M and N are the lengths of the given arrays.
        This is because both the arrays are traversed once.

        Space Complexity: O(min(m, n)), extra space to store answer is not considered.
     */
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;

        while (i < n && j < m){
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        if (list.isEmpty()){
            return new int[]{};
        }

        // Convert List<Integer> to int[]
        int[] arr = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }

        return arr;

    }
}
