package S03_BitManipulation;

public class Q14_OddTimesOccurringNumber {

    public static int oddTimes(int[] arr){
        int res = 0;
        for (int i : arr){
            res = res ^ i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,5,5,6,6,6};
        System.out.println(oddTimes(arr));
    }
}
