package S03_BitManipulation;

public class Q13_MinimumBitsFlip {

    public static int minimumBitsFlip(int num1, int num2){
        int res = num1 ^  num2;

        // Now, count the number of set bits
        int count = 0;
        while(res != 0){
            res = res & (res-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumBitsFlip(13,7));

    }
}
