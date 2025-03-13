//To find out the number of times an array has been rotated
import java.util.Scanner;

public class Rotation_Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a scanner object for user input

        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n]; // Declare an array to store elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // Input array elements
        }

        System.out.println("The array has been rotated " + findpivot(arr)+" times.");

        in.close(); // Close Scanner object to prevent resource leak
    }

    static int findpivot(int[] arr) {
        int start = 0; // Initialize start index
        int end = arr.length - 1; // Initialize end index

        while (start <= end) {
            int mid = (start + end) / 2; // Calculate mid index

            if (arr[start] < arr[end]) {
                // Array is not rotated
                return 0;
            }
            if (mid < end && arr[mid] > arr[mid + 1]) { // If element at mid is greater than its next element, mid is
                                                        // the pivot
                return mid+1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) { // If element at mid is smaller than its previous element, mid
                                                          // - 1 is the pivot
                return mid;
            }
            if (arr[start] >= arr[mid]) { // If first element is greater than mid, search in the left half
                end = mid;
            } else { // If first element is smaller than mid, search in the right half
                start = mid + 1;
            }
        }

        return 0; // No pivot found, i.e. the array is not rotated
    }
}