package S03_BitManipulation;

public class Q12_EvenOdd {

    public static String evenOdd(int number) {
        if ((number & 1) == 0) return "even";
        else return "odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOdd(0));
        System.out.println(evenOdd(1));
        System.out.println(evenOdd(222123));
        System.out.println(evenOdd(554));
        System.out.println(evenOdd(4));
        System.out.println(evenOdd(23));
    }
}
