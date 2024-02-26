// Applying Binary Search on a rotated array.

import java.util.Scanner;

public class Bs_Rota_arr {
    public static void main(String[] args) {
        //To create a scanner object to take input from the user.
        Scanner in = new Scanner(System.in);

        //To input the number of array elements
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        //To input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        //To input the target element
        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        //To apply binary search on the target element
        System.out.println("The index of the target is: "+BinarySearch(arr, target));

        //To close Scanner object to prevent resource leak.
        in.close();
    }

    // Function definition to perform the binary search
    static int BinarySearch(int[] arr, int target) {
        // Find the pivot point
        int pivot = findpivot(arr);
        if (pivot == -1) { // The array is not rotated.
            return BS(arr, target, 0, arr.length - 1);
        }
        // If target is at pivot, return pivot
        if (arr[pivot] == target) {
            return pivot;
        }
        // If target is greater than the first element, search in the first half
        if (target > arr[0]) {
            return BS(arr, target, 0, pivot - 1);
        }
        // If target is smaller than the last element, search in the second half
        if (target < arr[arr.length - 1]) {
            return BS(arr, target, pivot + 1, arr.length - 1);
        }
        // Target not found
        return -1;
    }

    // Function definition to find the pivot
    static int findpivot(int[] arr) {
        // Initialize start and end indices
        int start = 0;
        int end = arr.length - 1;

        // Perform binary search to find the pivot
        while (start < end) { // Corrected the loop condition
            // Calculate mid index
            int mid = (start + end) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                // If element at mid is greater than its next element, mid is the pivot
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                // If element at mid is smaller than its previous element, mid - 1 is the pivot
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                // If first element is greater than mid, search in the left half
                end = mid - 1;
            } else {
                // If first element is smaller than mid, search in the right half
                start = mid + 1;
            }
        }

        // No pivot found, i.e. the array is not rotated.
        return -1;
    }

    // Function definition for binary search
    static int BS(int[] a, int b, int start, int end) {
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
