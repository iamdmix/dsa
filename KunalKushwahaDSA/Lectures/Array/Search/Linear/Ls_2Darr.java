//To perform Linear Search on a 2D array

import java.util.Arrays;
import java.util.Scanner;

public class Ls_2Darr {
    public static void main(String[] args) {
        // To create Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        // To input number of rows and columns
        System.out.print("Enter the number of rows and columns: ");
        int r = in.nextInt();
        int c = in.nextInt();

        // To input the elements
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // To input search element
        System.out.print("Enter the search element: ");
        int ele = in.nextInt();

        // To return the result of Linear Search
        int[] ans = search(arr, ele);
        System.out.println(Arrays.toString(ans));

        // To close the Scanner object to prevent resource leak
        in.close();
    }

    // Function Definition
    static int[] search(int[][] a, int b ){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]==b) {
                    return new int[]{i,j} ;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
