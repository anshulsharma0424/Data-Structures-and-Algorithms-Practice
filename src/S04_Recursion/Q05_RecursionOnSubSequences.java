package S04_Recursion;

import java.util.ArrayList;

public class Q05_RecursionOnSubSequences {
    public static void printAllSubSequences(int idx, int[] arr, int n, ArrayList<Integer> list) {
        if (idx >= arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        printAllSubSequences(idx+1, arr, n, list);
        list.removeLast();
        printAllSubSequences(idx+1, arr, n, list);
    }

    public static void printAllSubSequencesWhoseSumEqualsK(int idx, int[] arr, int n, ArrayList<Integer> list, int sum, int k) {
        if (idx >= arr.length) {
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[idx]);
        printAllSubSequencesWhoseSumEqualsK(idx+1, arr, n, list, sum + arr[idx], k);
        list.removeLast();
        printAllSubSequencesWhoseSumEqualsK(idx+1, arr, n, list, sum, k);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
//        printAllSubSequences(0, arr, arr.length, list);
        printAllSubSequencesWhoseSumEqualsK(0, arr, arr.length, list, 0, 1);
    }
}
