package b_LogicBuilding;

public class c_FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};
        System.out.println(missingNumber(nums));
    }
    // Optimal - I
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        // Summation of first N natural numbers
        int expectedTotal =  n * (n + 1) / 2;
        int givenTotal = 0;

        for ( int i = 0; i < n; i++){
            givenTotal += nums[i];
        }

        return expectedTotal - givenTotal;
    }
}
