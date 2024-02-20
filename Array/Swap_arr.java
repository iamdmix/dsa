//To take input of an array and to create a user defined function to swap the array elements at entered indices

import java.util.Arrays;
import java.util.Scanner;

public class Swap_arr {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        // To create an Array
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        // To input an array
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // To input the indices for the elements that have to be swapped
        System.out.print("Enter the elements indices that have to be swapped (only 2): ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        // To swap elemeents at n1 and n2
        swap(arr, n1, n2);

        //To print the modified array
        System.out.println("The modified array now is: ");
        System.out.println(Arrays.toString(arr));

        //To close Scanner object to prevent resource leak
        in.close();
    }

    static void swap(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
