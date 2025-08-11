package S04_Arrays;

public class Q08_FindMissingNumber {
    public static int missingNumber(int[] arr) {
        // int totalSum (when numbers are from 0 to n) = ((arr.length)*(arr.length + 1))/2;
        int totalSum = ((arr.length+1)*(arr.length + 2))/2; // (when numbers are from 1 to n)
        int actualSum = 0;
        for (int j : arr) {
            actualSum += j;
        }
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(arr));
    }
}
