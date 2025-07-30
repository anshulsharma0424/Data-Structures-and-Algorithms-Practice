package S03_BitManipulation;

public class Q07_ClearingIthBit {

    public static void clearingIthBit(int number, int place) {
        System.out.println(~(1 << place) & number);
    }

    public static void main(String[] args) {
        clearingIthBit(13, 0);
        clearingIthBit(13, 2);
        clearingIthBit(13, 3);
    }
}
