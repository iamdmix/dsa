//Insertion Sort on an array

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
        System.out.println("The array after sorting is: ");
        System.out.println(Arrays.toString(arr));

        // To close Scanner object to prevent resource leak
        in.close();
    }

    //Method to perform Insertion Sort
    static void insertionSort(int[]arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

}
