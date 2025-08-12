package S07_StackAndQueue;

public class Q09_TrappingRainWater {

    public static int trappingRainWater(int[] arr) {
        int leftMax = 0;
        int rightMax = 0;
        int totalTrappedWater = 0;

        int leftTrappedWater = 0;
        int rightTrappedWater = arr.length-1;

        while (leftTrappedWater < rightTrappedWater){
            if (arr[leftTrappedWater] <= arr[rightTrappedWater]){
                if (leftMax > arr[leftTrappedWater]){
                    totalTrappedWater += leftMax - arr[leftTrappedWater];
                } else leftMax = arr[leftTrappedWater];
                leftTrappedWater++;
            }
            else {
                if (rightMax > arr[rightTrappedWater]){
                    totalTrappedWater += rightMax - arr[rightTrappedWater];
                } else rightMax = arr[rightTrappedWater];
                rightTrappedWater--;
            }
        }
        return  totalTrappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2};
        System.out.println((trappingRainWater(arr)));
    }
}
