package c_FAQsMedium;

public class m_NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        // Output the original array
        System.out.print("Given array: ");
        for(int x : nums) System.out.print(x + " ");

        // Function call to get the next permutation of given array
        nextPermutation(nums);

        // Output the next permutation
        System.out.print("\nNext Permutation: ");
        for(int x : nums) System.out.print(x + " ");
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length; // Size of the given array

        // To store the index of the first smaller element from right
        int ind = -1;

        // Find the first index from the end where nums[i] < nums[i+1]
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        /* If no such index exists, array is in descending order
           So, reverse it to get the smallest permutation */
        if(ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Find the element just greater than nums[ind] from the end
        for(int i = n - 1; i > ind; i--) {
            if(nums[i] > nums[ind]) {
                swap(nums, i, ind); // Swap with nums[ind]
                break;
            }
        }

        // Reverse the right half to get the next smallest permutation
        reverse(nums, ind + 1, n - 1);
        return;
    }

    // Helper Function to swap two numbers in an array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // Helper function to reverse the array
    private static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
