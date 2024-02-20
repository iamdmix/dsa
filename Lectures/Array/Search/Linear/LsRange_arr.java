/*Search in the range: If element found return true
 *Otherwise return false
 */

import java.util.Scanner;

public class LsRange_arr {
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

        //To input the search range
        System.out.print("Enter the starting and ending index of range of search: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        // To print the result of Linear Search
        System.out.println(searchinrange(arr, ele, n1, n2));

        // To close Scanner object to prevent resource leak
        in.close();
    }

    // Function Definition
    static boolean searchinrange(int[] arr, int ele, int n1, int n2) {
        // Array length must obviously be non-zero
        if (arr.length == 0) {
            return false;
        }

        //n2 must be in range of array
        if (n2>arr.length-1) {
            return false;
        }

        // To search for ele using Linear Search Algorithm
        for (int i = n1; i < n2; i++) {
            if (arr[i] == ele) {
                return true;
            }
        }
        // If none of the above, element is absent, thus:
        return false;
    }
}
