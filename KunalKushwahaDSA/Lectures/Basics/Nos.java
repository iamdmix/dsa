//Program to print all whole numbers from 0 to n, where n is taken from the user
import java.util.Scanner;

public class Nos {
    public static void main(String[] args) {
        //To create an Scanner object to get input from user
        Scanner in = new Scanner(System.in);
        
        //To get the last number in range
        System.out.print("Enter the last number in range: ");
        int n = in.nextInt();
        
        //To print all numbers
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        //To close the scanner to prevent resource leak
        in.close();
    }
}
