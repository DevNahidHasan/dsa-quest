package b_Sorting;

import java.util.Arrays;

public class b_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        doSelectionSort(arr, arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void doSelectionSort(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if(r > c){

            if(arr[c] > arr[max]){
                doSelectionSort(arr,r,c+1,c);
            }else{
                doSelectionSort(arr, r, c+1, max);
            }

        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            doSelectionSort(arr,r-1,0,0);

        }
    }
}
