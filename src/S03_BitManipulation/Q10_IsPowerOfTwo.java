package S03_BitManipulation;

public class Q10_IsPowerOfTwo {

    public static boolean isPowerOfTwo(int number) {
        return (number & (number-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(31));
        System.out.println(isPowerOfTwo(32));
    }
}
