package b_Sorting;

import java.util.Arrays;

public class a_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        doBubbleSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void doBubbleSort(int[] arr,int r, int c){
        if (r == 0){
            return;
        }
        if(r > c){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            doBubbleSort(arr,r,c+1);
        }else {
            doBubbleSort(arr,r-1,0);

        }
    }
}
