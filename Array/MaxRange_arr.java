//To create a function that returns the greatest element in the given index range

import java.util.Scanner;

public class MaxRange_arr {
    public static void main(String[] args) {
        //To create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        //To input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();

        //To input the elements of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //To take input of the range of indices
        System.out.println("Enter the start and end index range: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        //To find the max in the given range
        System.out.println("The greatest element in the range is " + max(arr, n1, n2));

        //To close the Scanner object to prevent resource leak
        in.close();
    }
    
    //Function Definition
    static int max(int[] a, int b, int c){
        int m = a[b]; //Assuming 1st element is maximum
        
        if (c>(a.length-1)) {
            c = a.length-1;
        }

        //To check if other elements in the range are greater than it
        for (int i = b; i < c; i++) {
            if(a[i]>a[b]){
                m = a[i];
            }
        }
        
        //Returning the max value
        return a[m];
    }
}
