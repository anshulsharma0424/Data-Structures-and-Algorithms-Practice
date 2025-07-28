package S07_Recursion;

import java.util.ArrayList;

public class Q05_RecursionOnSubSequences {
    public static void printAllSubSequences(int idx, int[] arr, int n, ArrayList<Integer> list) {
        if (idx >= n) {
            System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        printAllSubSequences(idx+1, arr, n, list);
        list.removeLast();
        printAllSubSequences(idx+1, arr, n, list);
    }

    public static void printAllSubSequencesWhoseSumEqualsK(int idx, int[] arr, int n, ArrayList<Integer> list, int sum, int k) {
        if (idx >= n) {
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

    public static boolean printOneSubSequenceWithSumEqualsK(int idx, int[] arr, int n, ArrayList<Integer> list, int sum, int k) {
        if (idx >= n) {
            if (sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[idx]);
        if (printOneSubSequenceWithSumEqualsK(idx+1, arr, n, list, sum + arr[idx], k)) return true;
        list.removeLast();
        if (printOneSubSequenceWithSumEqualsK(idx+1, arr, n, list, sum, k)) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        printAllSubSequences(0, arr, arr.length, list);
        printAllSubSequencesWhoseSumEqualsK(0, arr, arr.length, list, 0, 1);
        printOneSubSequenceWithSumEqualsK(0, arr, arr.length, list, 0, 2);
    }
}
