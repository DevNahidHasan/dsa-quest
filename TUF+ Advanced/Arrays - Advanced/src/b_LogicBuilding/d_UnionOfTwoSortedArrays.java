package b_LogicBuilding;

import java.util.*;

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

    //Optimal Approach
    public static int[] unionArray2(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while ( i < n && j < m){
            if (nums1[i] <= nums2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            }
            else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j
                        ++;
            }
        }

        // Add remaining elements of nums1, if any
        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }

        // Add remaining elements of nums2, if any
        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                list.add(nums2[j]);
            }
            j++;
        }

        // Convert List<Integer> to int[]
        int[] Union = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            Union[k] = list.get(k);
        }

        return Union;
    }
}
