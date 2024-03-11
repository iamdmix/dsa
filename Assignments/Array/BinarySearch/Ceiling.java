//To find the Ceiling of a target in the given array
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Input the length of the array
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        // Input the array elements
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Input the target number to find Ceiling of
        System.out.print("Enter the number to find Ceiling of: ");
        int t = in.nextInt();

        // Find the Ceiling of the target number
        System.out.println("The Ceiling is: "+ceilingno(arr, t));

        // Close the Scanner object to prevent resource leak
        in.close();
    }

    // Function to find Ceiling of a target number in the given array
    static int ceilingno(int[] a, int t) {
        // Initialize start and end indices for binary search
        int start = 0;
        int end = a.length - 1;

        // If target is greater than the maximum element in the array, Ceiling doesn't exist
        if (t > a[end]) {
            return Integer.MIN_VALUE;
        }

        // Binary Search algorithm to find Ceiling
        while (start <= end) {
            // Calculate mid index
            int mid = start + (end - start) / 2;
            if (a[mid] == t) { // If target is found at mid
                return a[mid];
            }
            if (a[mid] < t) { // If target is in the right half
                start = mid + 1;
            } else { // If target is in the left half
                end = mid - 1;
            }
        }

        //If ceiling exists, return ceiling
        return a[start];
    }
}
