package S03_BitManipulation;

public class Q09_RemoveLastSetBit {

    public static void removeLastSetBit(int number) {
        System.out.println(number & (number-1));
    }

    public static void main(String[] args) {
        removeLastSetBit(13);
        removeLastSetBit(15);
        removeLastSetBit(16);
        removeLastSetBit(8);
        removeLastSetBit(4);
        removeLastSetBit(35);

        // Observation: if its power of 2 ---> 0. Else, the answer will be: "Number-1"

    }
}
