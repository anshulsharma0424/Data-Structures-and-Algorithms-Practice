package S03_BitManipulation;

public class Q02_ConvertToDecimal {

    public static int  convertToDecimal(String num){
        int len =  num.length();
        int powerOfTwo = 1, res = 0;

        for(int i = len-1; i >= 0; i--){
            if (num.charAt(i) == '1'){
                res += powerOfTwo;
            }
            powerOfTwo *= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convertToDecimal("111"));
        System.out.println(convertToDecimal("1101"));
        System.out.println(convertToDecimal("10001"));
        System.out.println(convertToDecimal("101"));
    }
}
