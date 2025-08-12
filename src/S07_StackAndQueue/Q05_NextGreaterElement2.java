package S07_StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class Q05_NextGreaterElement2 {

    public static int[] nextGreaterElement(int[] arr) {
        int n  = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2*n-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i%n]) st.pop();

            if (i < n) nge[i] = st.isEmpty()?-1:st.peek();

            st.push(arr[i%n]);
        }

        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {2,13,11,1,12};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }
}
