package S04_Recursion;

public class Q01_Basics {

    // Print your name n-times
    public static void printName(int n){
        if(n == 0) return;

        System.out.println("Anshul");
        printName(n-1);
    }

    // Print numbers from 1 to N
    public static void printOneToN(int val, int n){
        if (val > n) return;

        System.out.print(val + " ");
        printOneToN(val+1, n);
    }

    // Print numbers from 1 to N (using Backtracking)
    public static void printOneToN(int n){
        if (n < 1) return;

        printOneToN(n-1);
        System.out.print(n + " ");
    }

    // Print numbers from N to 1
    public static void printNtoOne(int n){
        if (n == 0) return;
        System.out.print(n + " ");
        printNtoOne(n-1);
    }

    public static void main(String[] args) {
        printName(5);
        printOneToN(1, 10);
        printOneToN(5);
        printNtoOne(5);
    }
}
