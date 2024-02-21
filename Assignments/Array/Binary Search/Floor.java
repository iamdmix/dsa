import java.util.Scanner;

public class Floor {
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

        // Input the target number to find Floor of
        System.out.print("Enter the number to find Floor of: ");
        int t = in.nextInt();

        // Find the Floor of the target number
        System.out.println("The Floor is: " + Floorno(arr, t));

        // Close the Scanner object to prevent resource leak
        in.close();
    }

    // Function to find Floor of a target number in the given array
    static int Floorno(int[] a, int t) {
        // Initialize start and end indices for binary search
        int start = 0;
        int end = a.length - 1;

        // If target is greater than the maximum element in the array, Floor doesn't
        // exist
        if (t < a[start]) {
            return Integer.MIN_VALUE;
        }

        // Binary Search algorithm to find Floor
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

        // If Floor exists, return Floor
        return a[end];
    }
}
