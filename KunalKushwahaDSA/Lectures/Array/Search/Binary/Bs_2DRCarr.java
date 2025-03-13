//Applying BS on a matrix that is sorted row and column wise
import java.util.Arrays;
import java.util.Scanner;

public class Bs_2DRCarr {
    public static void main(String[] args) {
        // To create Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        // To input number of rows and columns
        System.out.print("Enter the number of rows and columns: ");
        int r = in.nextInt();
        int c = in.nextInt();

        // To input the elements
        System.out.println("Enter the elements of the martix: ");
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
        int[] ans = search2D(arr, ele);
        System.out.println(Arrays.toString(ans));

        // To close the Scanner object to prevent resource leak
        in.close();
    }

    // Function Definition
    static int[] search2D(int[][] a, int b) {
        int r = 0;
        int c = a.length - 1;
        while (r < a.length && c >= 0) {
            if (a[r][c] == b) {
                return new int[] { r, c };
            }
            if (a[r][c] < b) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 }; // If element not found
    }
}
