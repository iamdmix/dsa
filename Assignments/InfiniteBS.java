/* Find the position of an element in a sorted array of infinite elements
 * To mimic this situation we can take an array of finite length but we cannot use the length of the array in any case.
 * PS: If an error shows up that index out of bounds, then please ignore it as when the array will have infinite no.s it will work.
 */

import java.util.Scanner;

public class InfiniteBS {
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
        System.out.println("The index of " + ele + " is " + infiniteBS(arr, ele));

        // Close Scanner object to prevent resource leak
        in.close();
    }

    static int infiniteBS(int[] arr, int target) {
        // We can solve this problem by taking chunks of array elements at a time
        int start = 0;
        int end = 1;

        // To check if the target lies in the range of start and end
        while (target > arr[end]) {
            // To double the search range
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] a, int b, int s, int e) {
        // Initialize start and end indices
        int start = s;
        int end = e;
        int ans = -1; // Initialize result to -1

        // Binary Search algorithm
        while (start <= end) {
            // Calculate mid index
            int mid = start + (end - start) / 2;
            if (a[mid] == b) { // If element found at mid
                return mid;
            }
            if (a[mid] < b) { // If element is in the right half
                start = mid + 1;
            } else { // If element is in the left half
                end = mid - 1;
            }
        }
        // If element not found, return -1
        return ans;
    }
}
