import java.util.Scanner;

public class Bin_search {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Input length of the array
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();

        // Input the array elements
        System.out.println("Enter the SORTED array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Input the search element
        System.out.print("Enter the search element: ");
        int ele = in.nextInt();

        // Perform Binary Search 
        int s =0;
        int e = arr.length -1;
        System.out.println("The index of " + ele + " is " + search(arr, ele, s, e));

        // Close Scanner object to prevent resource leak
        in.close();
    }

    //Function definition for Binary Search using recursion
    //Taking the start and end as arguments as we need them everytime we have to call the function (recursive call)
    public static int search(int[] arr, int target, int start, int end) {
        //Start must always be smaller than the end for binary search
        if (start > end) {
            return -1;
        }
        
        //Calculating the value on mid
        int mid = start + (end - start) / 2;
        
        //target found at index mid
        if(target == arr[mid]){
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);   //recursive call
        }

        //if(target < arr[mid])
        return search(arr, target, start, mid-1);   //recursive function call
    }
}
