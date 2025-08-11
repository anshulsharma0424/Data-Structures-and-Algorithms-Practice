package S04_Arrays;

import java.util.Arrays;

public class Q04_ArrayRotation {

    public static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void leftRotate(int[] arr, int k) {
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, arr.length - k - 1);
        reverseArray(arr, arr.length - k, arr.length - 1);
    }

    public static void rightRotate(int[] arr, int k) {
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        leftRotate(arr1, 2);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        rightRotate(arr2, 2);
        System.out.println(Arrays.toString(arr2));

    }
}
