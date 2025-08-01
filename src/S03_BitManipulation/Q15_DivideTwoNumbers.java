package S03_BitManipulation;

public class Q15_DivideTwoNumbers {

    static long divide(long a, long b) {

        // Handle overflow
        if (a == Integer.MIN_VALUE && b == -1)
            return Integer.MAX_VALUE;

        // The sign will be negative only if sign of divisor and dividend are different
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;

        // remove sign of operands
        a = Math.abs(a);
        b = Math.abs(b);

        // Initialize the quotient
        long quotient = 0;

        // Iterate from the most significant bit to the least significant bit
        for (int i = 31; i >= 0; --i) {

            // Check if (divisor << i) <= dividend
            if ((b << i) <= a) {
                a -= (b << i);
                quotient |= (1L << i);
            }
        }
        return sign * quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(48, -8));
    }
}
