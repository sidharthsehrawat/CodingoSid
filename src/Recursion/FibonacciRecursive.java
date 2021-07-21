package Recursion;

public class FibonacciRecursive {
    private static int FibonacciRecur(int num) {
        int ch = 0;
        if (num <= 1) {
            return num;
        } else {
            //System.out.println(ch);
            ch = FibonacciRecur(num - 1) + FibonacciRecur(num - 2);
            // System.out.println(ch);
        }
        return ch;
    }

    public static void main(String[] args) {
        int num = 6;
        for (int i = 0; i < num; i++) {
            System.out.println(" " + FibonacciRecur(i));

        }
    }
}
