package S05_BinarySearch;

public class Q05_FirstLastOccurrence {

    public static int firstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                ans = mid;
                right = mid - 1;
            }
            else if(arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                ans = mid;
                left = mid + 1;
            }
            else if(arr[mid] > key){
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int x = 13;
        System.out.println(firstOccurrence(arr, x));
        System.out.println(lastOccurrence(arr, x));
        System.out.println("Total occurrences of " + x + " is: " + (lastOccurrence(arr, x) - firstOccurrence(arr, x) + 1));
    }
}
