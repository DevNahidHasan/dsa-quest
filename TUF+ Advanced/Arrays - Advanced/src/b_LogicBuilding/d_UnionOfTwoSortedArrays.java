package b_LogicBuilding;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class d_UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        int[] union = unionArray(nums1,nums2);
        System.out.println(Arrays.toString(union));
    }
    // Brute force approach
    public static int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();

        //Insert all elements of nums1 into the set
        for (int num : nums1){
            set.add(num);
        }

        //Insert all elements of nums2 into the set
        for (int num : nums2){
            set.add(num);
        }

        //Convert the set to an integer array to get the union
        int[] union = new int[set.size()];
        int index = 0;
        for (int num : set){
            union[index++] = num;
        }

        return union;
    }
}
