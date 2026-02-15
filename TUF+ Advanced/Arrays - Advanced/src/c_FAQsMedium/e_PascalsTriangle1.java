package c_FAQsMedium;

public class e_PascalsTriangle1 {

    public static void main(String[] args) {
        // row number
        int r = 5;
        // col number
        int c = 3;

        // Function call to print the element in rth row and cth column
        int ans = pascalTriangleI(r, c);

        System.out.println("The element in the rth row and cth column in pascal's triangle is: " + ans);
    }
    // Function to print the element in rth row and cth column
    public static int pascalTriangleI(int r, int c) {
        return nCr(r-1, c-1);
    }

    // Function to calculate nCr
    private static int nCr(int n, int r)  {
        // Choose the smaller value for lesser iterations
        if(r > n-r) r = n-r;

        // base case
        if(r == 1) return n;

        int res = 1; // to store the result

//        // Calculate nCr using iterative method avoiding overflow
//        for (int i = 0; i < r; i++) {
//            res = res * (n - i);
//            res = res / (i + 1);
//        }

        // Simplified the above for loop
        // Calculate nCr using iterative method avoiding overflow
        for (int i = 1; i <= r; i++) {
            res = res * n--;
            res = res / i;
        }

        return res; // return the result
    }
}
