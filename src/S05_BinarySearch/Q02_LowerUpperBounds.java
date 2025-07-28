package S05_BinarySearch;

public class Q02_LowerUpperBounds {

    public static int lowerBound(int[] arr, int x){
        int n = arr.length;
        int ans = -1;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public static int upperBound(int[] arr, int x){
        int n = arr.length;
        int ans = -1;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 9, 15, 19 };
        int x = 9;
        System.out.println(lowerBound(arr, x));
        System.out.println(upperBound(arr, x));
    }
}
