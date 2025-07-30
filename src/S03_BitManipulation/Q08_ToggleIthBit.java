package S03_BitManipulation;

public class Q08_ToggleIthBit {

    public static void toggleBit(int number, int place){
        System.out.println((1 << place) ^ number);
    }

    public static void main(String[] args) {
        toggleBit(13, 1);
        toggleBit(13, 2);
    }
}
