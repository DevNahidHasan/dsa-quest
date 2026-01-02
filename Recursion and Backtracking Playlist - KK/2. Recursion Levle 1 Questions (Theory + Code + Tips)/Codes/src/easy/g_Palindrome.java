package easy;

public class g_Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }

    static boolean isPalindrome(int n){
        return n == rev(n);
    }

    static int rev(int n){

        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if (n%10 == n){
            return n;//if the number is 1-digit number return the number itself
        }
        int remainder = n % 10;
        int newN = n / 10;
        return remainder * (int)Math.pow(10,digits-1) + helper( newN, digits -1);
    }
}
