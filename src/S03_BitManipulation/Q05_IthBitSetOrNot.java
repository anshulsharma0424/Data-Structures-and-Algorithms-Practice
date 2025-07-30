package S03_BitManipulation;

public class Q05_IthBitSetOrNot {

    public static boolean isSetBit(int number, int place){
        if ((number & (1 << place)) != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSetBit(13,0));
        System.out.println(isSetBit(13,1));
        System.out.println(isSetBit(13,2));
        System.out.println(isSetBit(13,3));
    }
}
