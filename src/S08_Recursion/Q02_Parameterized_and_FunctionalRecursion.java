package S08_Recursion;

public class Q02_Parameterized_and_FunctionalRecursion {
    // Print 'sum' from 1 to N (Parameterized recursion)
    // -> In Parameterized Recursion, we pass the result (or part of the result) as a parameter while making the recursive calls.
    public static void printSum(int i, int sum){
        if (i == 0) {
            System.out.println(sum);
            return;
        }
        printSum(i-1, sum + i);
    }

    // Print 'sum' from 1 to N (Functional recursion)
    // -> In Functional Recursion, the function returns the final result back through return statements.
    public static int printSum(int n){
        if (n == 0) {
            return 0;
        }
        return n + printSum(n-1);
    }

    public static void main(String[] args) {
        printSum(10, 0);
        System.out.println(printSum(10));
    }
}
