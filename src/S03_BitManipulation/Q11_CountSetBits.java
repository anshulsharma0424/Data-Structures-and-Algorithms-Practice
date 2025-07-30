package S03_BitManipulation;

public class Q11_CountSetBits {

    public static int countSetBits(int number) {
        int count = 0;
        while (number != 0) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(13));
        System.out.println(countSetBits(15));
        System.out.println(countSetBits(16));
    }
}
