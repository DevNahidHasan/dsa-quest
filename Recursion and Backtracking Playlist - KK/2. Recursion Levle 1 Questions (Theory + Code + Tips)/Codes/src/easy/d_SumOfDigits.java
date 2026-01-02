package easy;

public class d_SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }
    static int sum(int n){
        if( n / 10 == 0){
            return n;
        }
        int remainder = n % 10;
        return remainder + sum( n / 10);

    }
}
