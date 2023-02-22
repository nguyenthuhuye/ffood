//2.6. Write a program to the find the following
// 2.6.2 Sum of digit


import java.util.Scanner;

public class b262 {
    static int getSum(int n)
    {
        int sum;

        for (sum = 0; n > 0; sum += n % 10, n /= 10)
            ;

        return sum;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count sum number of digit: ");
        n = scanner.nextInt();
        System.out.println(getSum(n));
    }
}
