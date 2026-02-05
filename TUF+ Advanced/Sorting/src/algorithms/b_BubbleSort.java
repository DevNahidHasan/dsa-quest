package algorithms;

import java.util.Arrays;

public class b_BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 4, 1, 1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i <= n - 2; i++){
            boolean isSwapped = false;
            for (int j = 0 ; j <= n - i - 2; j++){
                if ( nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }

}
