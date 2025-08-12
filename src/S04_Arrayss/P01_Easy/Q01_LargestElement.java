package S04_Arrayss.P01_Easy;

public class Q01_LargestElement {

    public static int largestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > largest) largest = arr[i];
        }
        return largest;
    }
}
