package easy;

public class h_CountZeros {
    public static void main(String[] args) {
        System.out.println(count(30409));
    }

    static int count(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if( n == 0){
            return count;
        }
        int remainder = n % 10;
        int newN = n / 10;
        if (remainder == 0){
            count++;
        }
        return helper(newN,count);
    }
}
