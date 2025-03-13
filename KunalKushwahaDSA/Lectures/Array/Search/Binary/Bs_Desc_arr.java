//To implement Binary Search for an array in descending order
import java.util.Scanner;

public class Bs_Desc_arr {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Input length of the array
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        // Input the array elements
        System.out.println("Enter the SORTED array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Input the search element
        System.out.print("Enter the search element: ");
        int ele = in.nextInt();

        // Perform Binary Search
        System.out.println("The index of " + ele + " is " + BinarySearch(arr, ele));

        // Close Scanner object to prevent resource leak
        in.close();
    }

    // Function Definition for Binary Search
    static int BinarySearch(int[] a, int b) {
        // Initialize start and end indices
        int start = 0;
        int end = a.length - 1;
        int ans = -1; // Initialize result to -1

        // Binary Search algorithm
        while (start <= end) {
            // Calculate mid index
            int mid = start + (end - start) / 2;
            if (a[mid] == b) { // If element found at mid
                return mid;
            }
            if (a[mid] > b) { // If element is in the right half
                start = mid + 1;
            } else { // If element is in the left half
                end = mid - 1;
            }
        }
        // If element not found, return -1
        return ans;
    }
}