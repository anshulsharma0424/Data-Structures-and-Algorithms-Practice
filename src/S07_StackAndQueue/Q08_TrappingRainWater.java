package S07_StackAndQueue;

import java.util.Arrays;

public class Q08_TrappingRainWater {

    public static int trappingRainWater(int[] arr){

        int[] prefixMax = new int[arr.length];
        prefixMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            prefixMax[i] = Math.max(prefixMax[i-1],arr[i]);
        }

        int[] suffixMax = new int[arr.length];
        suffixMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1],arr[i]);
        }

        int totalTrappedWater = 0;

        for (int i = 0; i < arr.length; i++){
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];

            if (arr[i] < leftMax && arr[i] < rightMax) totalTrappedWater += Math.min(leftMax, rightMax) - arr[i];
        }

        return  totalTrappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println((trappingRainWater(arr)));
    }
}
