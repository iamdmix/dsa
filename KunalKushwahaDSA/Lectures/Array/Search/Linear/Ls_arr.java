/*Search in the array: If element found return index
 *Otherwise return -1
 */

import java.util.Scanner;

public class Ls_arr {
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

        // To input the search element
        System.out.print("Enter the search element: ");
        int ele = in.nextInt();

        // To perform Linear Search
        System.out.println("The index of " + ele + " is " + linearsearch(arr, ele));

        //To close Scanner object to prevent resource leak
        in.close();
    }

    // Function Definition
    static int linearsearch(int[] arr, int ele) {
        //Array length must obviously be non-zero
        if (arr.length == 0) {
            return -1;
        }

        //To search for ele using Linear Search Algorithm
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        //If none of the above, element is absent, thus:
        return -1;
    }
}
