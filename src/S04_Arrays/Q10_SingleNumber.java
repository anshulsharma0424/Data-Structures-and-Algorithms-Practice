package S04_Arrays;

public class Q10_SingleNumber {

    public static int singleNumber(int[] arr) {
        int temp = 0;
        for (int j : arr) {
            temp ^= j;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,4};
        System.out.println(singleNumber(arr));
    }
}
