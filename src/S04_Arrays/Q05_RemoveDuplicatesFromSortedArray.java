package S04_Arrays;

public class Q05_RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,5};
        System.out.println(removeDuplicates(arr));
    }
}
