public class b_BS {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        System.out.println(search(arr,target,0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m] == target){
            return m;
        }
        else if (target < arr[m]) {
            e = m - 1;
            return search(arr, target, s, e);
        }
        s = m + 1;
        return search(arr,target, s, e);
    }

}
