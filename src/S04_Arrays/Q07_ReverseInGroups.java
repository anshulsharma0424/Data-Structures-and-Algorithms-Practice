package S04_Arrays;

import java.util.Arrays;

public class Q07_ReverseInGroups {

    public static void reverseInGroups(int[] arr, int k){
        for (int i = 0; i < arr.length; i+=k) {
            int low = i;
            int high = Math.min(i+k-1, arr.length-1);
            while (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverseInGroups(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
