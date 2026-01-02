package easy;

public class e_ProductOfDigits {
    public static void main(String[] args) {
        int ans = product(505);
        System.out.println(ans);
    }
    static int product(int n){
        if( n / 10 == 0){
            return n;
        }
        int remainder = n % 10;
        int newN = n / 10;
        return remainder * product( newN);

    }
}
