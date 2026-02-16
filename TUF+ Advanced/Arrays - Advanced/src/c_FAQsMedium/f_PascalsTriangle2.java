package c_FAQsMedium;

import java.util.Arrays;

public class f_PascalsTriangle2 {
    public static void main(String[] args) {
        // row number
        int r = 5;

        // Function call to return the rth row of Pascal's triangle
        int[] ans = pascalTriangleII(r);

        // Output
        System.out.println("Row " + r + ": ");
        System.out.println(Arrays.toString(ans));
    }

    public static int[] pascalTriangleII(int r) {
        int[] ans = new int[r];// to store the answer

        // Set the first element of the row as 1
        ans[0] = 1;

        // Compute each element in the rth row
        for (int i = 1; i < r; i++){
            ans[i] = (ans[i - 1] * (r - i)) / i ;
        }

        return ans;
    }
}
