package S05_BinarySearch;

public class Q01_BinarySearchImplementation {

    public static int binarySearch(int[] arr, int key) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearch(arr, 17));
    }
}
