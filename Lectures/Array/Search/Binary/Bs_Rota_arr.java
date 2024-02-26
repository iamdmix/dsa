// Applying Binary Search on a rotated array.

import java.util.Scanner;

public class Bs_Rota_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a scanner object for user input

        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n]; // Declare an array to store elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // Input array elements
        }

        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        System.out.println("The index of the target is: " + BinarySearch(arr, target));

        in.close(); // Close Scanner object to prevent resource leak
    }

    static int BinarySearch(int[] arr, int target) {
        int pivot = findpivot(arr); // Find the pivot point
        if (pivot == -1) { // The array is not rotated
            return BS(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) { // If target is at pivot, return pivot
            return pivot;
        }
        if (target > arr[0]) { // If target is greater than the first element, search in the first half
            return BS(arr, target, 0, pivot - 1);
        }
        if (target < arr[arr.length - 1]) { // If target is smaller than the last element, search in the second half
            return BS(arr, target, pivot + 1, arr.length - 1);
        }
        return -1; // Target not found
    }

    static int findpivot(int[] arr) {
        int start = 0; // Initialize start index
        int end = arr.length - 1; // Initialize end index

        while (start < end) {
            int mid = (start + end) / 2; // Calculate mid index

            if (mid < end && arr[mid] > arr[mid + 1]) { // If element at mid is greater than its next element, mid is
                                                        // the pivot
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) { // If element at mid is smaller than its previous element, mid
                                                          // - 1 is the pivot
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) { // If first element is greater than mid, search in the left half
                end = mid - 1;
            } else { // If first element is smaller than mid, search in the right half
                start = mid + 1;
            }
        }

        return -1; // No pivot found, i.e. the array is not rotated
    }

    static int BS(int[] a, int b, int start, int end) {
        int ans = -1; // Initialize result to -1

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index
            if (a[mid] == b) { // If element found at mid
                return mid;
            }
            if (a[mid] < b) { // If element is in the right half
                start = mid + 1;
            } else { // If element is in the left half
                end = mid - 1;
            }
        }
        return ans; // If element not found, return -1
    }
}