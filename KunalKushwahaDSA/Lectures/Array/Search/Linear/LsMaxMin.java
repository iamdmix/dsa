
//To create functions to find the max and min elements of an array
import java.util.Scanner;

public class LsMaxMin {
    public static void main(String[] args) {
        // To create a Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        // To input the number of elements in the array
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        // To input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // To get the max and min elements
        System.out.println("Max: " + Max(arr) + "\nMin: " + Min(arr));

        // To close Scanner object to prevent resource leak
        in.close();
    }

    // Function Definiton for Max
    static int Max(int[] arr) {
        //Assuming arr.length !=0
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function Definition for Min
    static int Min(int[] arr) {
        // Assuming arr.length !=0
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
