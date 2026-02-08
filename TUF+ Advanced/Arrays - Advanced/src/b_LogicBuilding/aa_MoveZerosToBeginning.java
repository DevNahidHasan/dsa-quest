package b_LogicBuilding;

import java.util.Arrays;

public class aa_MoveZerosToBeginning {
    public static void main(String[] args) {
        int[] nums ={0, 1, 4, 0, 5, 2};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void moveZeros(int[] nums){
        int n = nums.length;
        int j = n-1;// J keeps track of where the next non-zero should be placed
        for (int i = n -1; i >= 0; i--){
            // if current element is non-zero swap it with j
            if (nums[i] != 0){

                if (i == j){// no need to swap, as non-zero at correct place
                    j--;
                    continue;
                }

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
            }
        }
    }
}
