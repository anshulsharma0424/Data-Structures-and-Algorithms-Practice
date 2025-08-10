package S08_Recursion;

import java.util.Arrays;

public class Q03_FunctionalRecursion {
    // Reverse an array (Parameterized recursion)
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start+1, end - 1);
    }

    // Reverse an array (Functional recursion)
    public static void reverseArray(int i, int[] arr, int n){
        if (i > n/2) return;

        int temp = arr[i];
        arr[i] = arr[n - i];
        arr[n - i] = temp;

        reverseArray(i + 1, arr, n);
    }

    // Check if the string is palindrome or not
    public static boolean isPalindrome(String str, int i, int n) {
        if (i > n/2) return true;

        if (str.charAt(i) != str.charAt(n-i)){
            return false;
        }
        return isPalindrome(str, i+1, n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        reverseArray(0, arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
        String str = "MADAM";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
