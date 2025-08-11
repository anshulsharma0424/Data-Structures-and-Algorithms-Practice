package S04_Arrays;

import java.util.Arrays;

public class Q06_MoveZerosToEnd {

    public static void removeZeros(int[] arr) {
        int j=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,2,0,3,4,0,1};
        removeZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
