//Write a program to print the following triangle of binary digits java
//5
//4 5
//3 4 5
//2 3 4 5
//1 2 3 4 5
// 0 1 2 3 4 5

public class b252 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
