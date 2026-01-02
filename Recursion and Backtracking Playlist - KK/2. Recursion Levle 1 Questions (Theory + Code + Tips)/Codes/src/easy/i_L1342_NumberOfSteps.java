//Leetcode - 1342. Number of Steps to Reduce a Number to Zero
//Link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/


package easy;


public class i_L1342_NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        return countSteps(num, 0);
    }

    static int countSteps(int n, int step){
        if( n == 0){
            return step;
        }
        int newN;
        if(n % 2 == 0){
            newN = n / 2;
        }else{
            newN = n - 1;
        }

        return countSteps(newN, ++step);
    }
}
