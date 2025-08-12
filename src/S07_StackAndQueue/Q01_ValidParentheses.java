package S07_StackAndQueue;

import java.util.Stack;

public class Q01_ValidParentheses {

    public static boolean isValidParentheses(String s){
        if (s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' ||  s.charAt(i) == '{') stack.push(s.charAt(i));
            else {
                if (stack.isEmpty()) return false;

                char ch = stack.peek();
                stack.pop();
                if ((s.charAt(i) == ')' && ch != '(') || (s.charAt(i) == ']' && ch != '[') || (s.charAt(i) == '}' && ch != '{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "(){()[]}";
        String str2 = "([]{)}";
        String str3 = "([]{)}}";

        System.out.println(isValidParentheses(str1));
        System.out.println(isValidParentheses(str2));
        System.out.println(isValidParentheses(str3));
    }
}
