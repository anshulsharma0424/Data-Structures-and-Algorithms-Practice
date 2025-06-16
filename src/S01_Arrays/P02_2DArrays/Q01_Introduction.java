package S01_Arrays.P02_2DArrays;

/*
    Given 'n' number of columns and 'm' number of rows, m*n numbers. Now create a 2D array and display it.

    Note: number of rows = arr.length, and number of columns = arr[0].length {See the memory view for reference}
*/

import java.util.Scanner;

public class Q01_Introduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (M) here: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (N) here: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.print("Enter the elements of array: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
