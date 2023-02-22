//7.3 Write a program to find the solution for the following problems using Recursion.
//7.3.2 Find the Fibonacci numbers are defined as Fo-1,F1-1 and Fi-Fi-1+Fi-2 for i >2.

public class FibonacciRecursion {

    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The first " + n + " Fibonacci numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }
}

