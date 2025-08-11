package S04_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q03_UnionOfTwoSortedArrays {

    public static int[] unionA(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i :  arr1) {
            set.add(i);
        }
        for (int i :  arr2) {
            set.add(i);
        }
        int[] res = new  int[set.size()];
        int index = 0;
        for (Integer integer : set) {
            res[index++] = integer;
        }
        return res;
    }

//    public  static int[] unionB(int[] arr1, int[] arr2) {
//        int index1 = 0;
//        int index2 = 0;
//
//        ArrayList <Integer> list = new ArrayList<>();
//
//        while (index1 < arr1.length && index2 < arr2.length) {
//            if (arr1[index1] < arr2[index2]) {
//                list.add(arr1[index1++]);
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,5,7};

        System.out.println(Arrays.toString(unionA(arr1, arr2)));
    }
}
