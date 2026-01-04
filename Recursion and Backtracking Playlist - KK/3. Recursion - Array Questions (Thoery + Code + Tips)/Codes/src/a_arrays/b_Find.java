package a_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class b_Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 8};
        System.out.println(doFind(arr,5,0));
        System.out.println(doFindIndex(arr,5,0));
        System.out.println(doFindIndexReverse(arr,5,arr.length-1));
        doFindAllIndex(arr,5,0);
        System.out.println(list);
    }

    static boolean doFind(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || doFind(arr, target, index + 1);

    }

    static int doFindIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return doFindIndex(arr, target, index + 1);

    }

    static int doFindIndexReverse(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return doFindIndex(arr, target, index - 1);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void doFindAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        doFindAllIndex(arr, target, index + 1);

    }
}
