//To take an unsorted array and to return the rank of each element in it.
import java.util.Scanner;

public class Rank_arr {
    public static void main(String[] args) {
        //To create Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        //To take input of number of elements
        System.out.print("Enter the number of elemetns in the array: ");
        int n = in.nextInt();

        //To take input of elements
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            arr1[i] = arr[i];   //To get a copy of the array
        }

        //To sort the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr1[i]<arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        //To print the rank of the elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr1[j]){
                    System.out.print(j+1+" ");
                }
            }
        }

        //To close the Scanner object to prevent resource leak
        in.close();
    }
}