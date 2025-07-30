package S03_BitManipulation;

public class Q06_SettingIthBit {

    public static void setBit(int number, int place){
        System.out.println((1 << place) | number);
    }

    public static void main(String[] args) {
        setBit(68, 0);
    }
}
