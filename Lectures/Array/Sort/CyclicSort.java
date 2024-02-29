import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
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

        // Perform cyclic sort
        cyclicSort(arr);

        // Print the sorted array
        System.out.println("The array after sorting is: ");
        System.out.println(Arrays.toString(arr));

        // Close the Scanner object to prevent resource leak
        in.close();
    }

    // Method to perform cyclic sort
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    // Method to swap elements in an array
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}