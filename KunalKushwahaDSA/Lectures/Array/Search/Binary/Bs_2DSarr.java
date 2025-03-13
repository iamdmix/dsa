//Applying BS on a matrix that is strictly sorted.
import java.util.Arrays;
import java.util.Scanner;

public class Bs_2DSarr {
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
        int[] ans = search2DS(arr, ele);
        System.out.println(Arrays.toString(ans));

        // To close the Scanner object to prevent resource leak
        in.close();
    }

    // To find element in a given row
    static int[] BinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }
            if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    // Function Definition
    static int[] search2DS(int[][] martix, int target) {
        int rows = martix.length;
        int cols = martix[0].length;
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        if (rows == 1) {
            return BinarySearch(martix, 0, 0, cols - 1, target);
        }

        // We want to eliminate all rows and keep only 2 (rows: rStart & rStart+1)
        while (rStart < rEnd - 1) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (martix[rMid][cMid] == target) {
                return new int[] { rMid, cMid };
            }
            if (martix[rMid][cMid] < target) {
                rStart = rMid;
            }
            if (martix[rMid][cMid] > target) {
                rEnd = rMid;
            }
        }

        // Now that we have only 2 rows,
        // First let's check if the current column contains target
        if (martix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (martix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // Let's now check the parts individually
        // First row, 0 -> cMid-1
        if (target <= martix[rStart][cMid - 1]) {
            return BinarySearch(martix, rStart, 0, cMid - 1, target);
        }
        // First row, cMid+1 -> col-1 (end of row)
        if (target >= martix[rStart][cMid + 1] && target <= martix[rStart][cols - 1]) {
            return BinarySearch(martix, rows, cMid + 1, cols - 1, target);
        }
        // Second row, 0 -> cMid-1
        if (target <= martix[rStart + 1][cMid - 1]) {
            return BinarySearch(martix, rStart + 1, 0, cMid - 1, target);
        }
        // Second row, cMid-1 -> cols-1 (end of row)
        else {
            return BinarySearch(martix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
