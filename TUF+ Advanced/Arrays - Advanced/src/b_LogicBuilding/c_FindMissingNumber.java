package b_LogicBuilding;

public class c_FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};
        System.out.println(missingNumber2(nums));
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

    // Optimal II - XOR
    public static int missingNumber2(int[] nums) {
        int xor1 = 0, xor2 = 0;

        // Calculate XOR of all array elements
        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ (i + 1); // XOR up to [1...N]
            xor2 = xor2 ^ nums[i]; // XOR of array elements
        }

        // XOR of xor1 and xor2 gives missing number
        return (xor1 ^ xor2);
    }
}
