package S09_Strings;

public class Q02_StringReversal {

    // TC = O(n) and SC = O(n)
    public static String reverseString1(String str){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= str.length()-1; i++){
            res.insert(0, str.charAt(i));
        }
        return res.toString();
    }

    // TC = O(n) and SC = O(1)
    public static String reverseString2(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

//    public static String reverseString3(String str) {
//
//    }

    public static void main(String[] args) {
        String str = "Anshul Sharma is awesome";
        System.out.println(reverseString1(str));
    }
}
