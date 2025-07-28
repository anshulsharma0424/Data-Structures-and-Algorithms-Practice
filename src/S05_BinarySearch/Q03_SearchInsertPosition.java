package S05_BinarySearch;

public class Q03_SearchInsertPosition {

    public static int insertPosition(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7 };
        int toInsert = 6;
        System.out.println(insertPosition(arr, toInsert));
    }
}
