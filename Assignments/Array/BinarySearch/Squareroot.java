import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Input the number to find the square root of
        System.out.print("Enter the number to find the square root of: ");
        int n = in.nextInt();

        // Find the square root without using functions or operators
        int ans = sqroot(n);

        // Print the result
        System.out.println("The square root of " + n + " is " + ans);

        // Close the scanner object to prevent resource leak
        in.close();
    }

    // Function to find the square root
    public static int sqroot(int n) {
        if (n <= 0) {
            return 0;
        } else if (n <= 4) {
            return n == 4 ? 2 : 1; // Square root of 4 is 2, square root of 1, 2, 3 is 1
        }
        // Create an array until only half of n as n/2 > sqrt(n) always
        int[] arr = new int[n / 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // Perform Binary Search on the array
        int ans = bs(arr, n);
        return ans;
    }

    // Function to perform Binary Search
    public static int bs(int[] arr, int target) {
        // Initialize values
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            // Calculate the square of the middle element
            int mid = arr[m] * arr[m];
            if (mid == target) {
                return arr[m];
            }
            if (mid > target) {
                end = m - 1;
            }
            if (mid < target) {
                start = m + 1;
            }
        }
        // Return the closest value smaller than sqrt(target)
        return end;
    }
}
