package S07_StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class Q06_NextSmallerElement1 {

    public static int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] nse =  new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) st.pop();
            if (st.isEmpty()) nse[i] = -1;
            else nse[i] = st.peek();
            st.push(arr[i]);
        }
        return nse;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,5,6,7,17,13,4,5,16};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nextSmallerElement(arr)));
    }
}
