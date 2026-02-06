package a_Fundamentals;

public class c_SecondLargestElement {
    public static void main(String[] args) {

    }
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        // if the array has less than two elements there is no second-largest element
        if ( n < 2){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if (nums[i] > max){
                smax = max;
                max = nums[i];
            }
            else if(nums[i] > smax && nums[i] < max){
                smax = nums[i];
            }
        }

        return smax == Integer.MIN_VALUE ? -1 : smax;

    }
}
