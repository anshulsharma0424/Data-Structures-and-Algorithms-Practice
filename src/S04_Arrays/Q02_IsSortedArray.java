package S04_Arrays;

public class Q02_IsSortedArray {

    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i-1] > arr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
    }
}
