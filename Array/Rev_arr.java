//To create a function to reverse an array and return it to the user

import java.util.Arrays;
import java.util.Scanner;

public class Rev_arr {
    public static void main(String[] args) {
        //To create Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        //To input number of elements from user
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        //To input array elements from user
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        rev(arr);   //Function Call
        //To close the Scanner object to prevent resource leak
        in.close();
    }

    //Function Definition
    static void rev(int[] a){
        //To create the reversed array
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length-1-i];
        }

        //To print the result
        System.out.println(Arrays.toString(b));
    }
}
