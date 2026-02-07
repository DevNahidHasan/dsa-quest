package a_Fundamentals;

public class b_LargestElement {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 3};
        System.out.println(largestElement(nums));
    }
    public static int largestElement(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }

        }

        return max;
    }
}
