package S03_BitManipulation;

public class Q04_SwapTwoNumbers {

    public static void swapTwoNumbers(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        swapTwoNumbers(999999,6);
    }
}
