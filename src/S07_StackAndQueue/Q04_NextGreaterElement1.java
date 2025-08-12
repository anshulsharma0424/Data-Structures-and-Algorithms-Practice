package S07_StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class Q04_NextGreaterElement1 {

    public static int[] nextGreaterElement(int[] nums) {
        int[] nge =  new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            if (st.isEmpty()) nge[i] = -1;
            else  nge[i] = st.peek();
            st.push(nums[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {4,12,5,3,1,2,5,3,1,2,4,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }
}
