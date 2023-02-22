//2.5 Write a program to print the following triangle of binary digits.
//1
//101
//10001
//1000001
//100000001

public class b251 {

    public static void main (String[] args)
    {
        int rows = 9;
        for(int i = 1; i <= rows; i=i+2)
        {
            for(int j = 1; j <= i; j++)
            {
                if (j == 1 || j == i)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
