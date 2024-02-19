//To take an array input and then print the unique elements of that array
import java.util.Scanner;

public class Uni_arr {
    public static void main(String[] args) {
        //To create a Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        //To take input of number of elements from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();

        //To take input of the array elements from the user
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //To print the unique elements of the array
        System.out.println("The Unique elements of the array are: ");
        for (int i = 0; i < n; i++) {
            boolean flag = true;    //Assuming that the array element is unique
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]){
                    flag = false;
                }
            }
            //If the element is unique
            if (flag) {
                System.out.print(arr[i]+" ");
            }
        }

        //To close the Scanner object to prevent resource leak
        in.close();
    }

}
