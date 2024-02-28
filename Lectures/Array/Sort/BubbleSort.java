import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // To create Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        // To input length of array
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        // To input the array elements
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // To perform Bubble Sort
        int[] ans = bubbleSort(arr);
        System.out.println("The array after sorting is: ");
        System.out.println(Arrays.toString(ans));

        // To close Scanner object to prevent resource leak
        in.close();
    }
    
    // Method to perform bubble sort and return the sorted array
    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
