package S02_BinarySearch;

public class Q04_FloorCeilValues {

    public static int floorValue(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] <= x){
                ans = arr[mid];
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return ans;
    }

    public static int ceilValue(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] >= x){
                ans = arr[mid];
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 8;
        System.out.println(floorValue(arr, x));
        System.out.println(ceilValue(arr, x));
    }
}
