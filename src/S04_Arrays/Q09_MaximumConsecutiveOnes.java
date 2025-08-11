package S04_Arrays;

public class Q09_MaximumConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxConsecutive = 0;
        for(int n : nums){
            if (n == 1){
                count++;
            } else {
                maxConsecutive = Math.max(maxConsecutive, count);
                count = 0;
            }
        }
        maxConsecutive = Math.max(maxConsecutive, count); // last element is skipped when last sequence is max consecutive
        return maxConsecutive;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1,1,3,1,2,1,1,1,1,0,2,1,1,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }
}
