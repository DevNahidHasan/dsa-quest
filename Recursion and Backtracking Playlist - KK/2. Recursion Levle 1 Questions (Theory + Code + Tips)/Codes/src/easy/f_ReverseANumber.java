package easy;

public class f_ReverseANumber {

    static int sum = 0;

    public static void main(String[] args) {

        rev1(1234);
        System.out.println(sum);

        System.out.println();

        int ans = rev2(1234);
        System.out.println(ans);
    }

    static void rev1(int n){
        if (n == 0){
            return;
        }

        int remainder = n % 10;

        int newN = n / 10;

        sum = sum * 10 + remainder;

        rev1(newN);
    }

    static int rev2(int n){

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
