//7.3 Write a program to find the solution for the following problems using Recursion.
//7.3.1 Find the maximum of an array. Let a[] be an array of integers.
// if n= 1, a[0] is the only number in the array and so, maximum = a[0].
// if n > 1, then do the following: find the maximum of n-1 entries of the array.
// Compare this maximum with the last entry a[n-1] and finalize.


public class MaxArrayRecursion {

    public static int findMax(int[] arr, int n) {
        // If array contains only one element, it is the maximum element
        if (n == 1) {
            return arr[0];
        } else {
            // Find the maximum of n-1 elements in the array
            int max = findMax(arr, n - 1);

            // Compare the maximum with the last element of the array and update if necessary
            if (max > arr[n - 1]) {
                return max;
            } else {
                return arr[n - 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 67, 12, 9, 51, 34 };
        int n = arr.length;
        int max = findMax(arr, n);
        System.out.println("Maximum element in the array: " + max);
    }
}
