package S03_BitManipulation;

public class Q01_ConvertToBinary {
    public static String convertToBinary(int num) {
        String binary = "";
        while (num > 0){
            if (num % 2 == 1) binary = "1" +  binary;
            else binary = "0" +  binary;
            num /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(7));
        System.out.println(convertToBinary(13));
        System.out.println(convertToBinary(17));
        System.out.println(convertToBinary(7547));
    }
}
