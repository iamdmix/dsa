//To print the Fibonacci series for n terms, where n is taken from the user
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //To create Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        //To take input of the last term
        System.out.print("Enter the last term of the series: ");
        int n = in.nextInt();

        //To print the fibonacci series
        int a = 0;
        int b = 1;
        int fib = 0;
        System.out.print("0, 1");
        for (int i = 2; i < n; i++) {
            fib = a + b;
            System.out.print(", "+fib);
            a = b;
            b = fib;
        }

        //To close the scanner to prevent resource leak
        in.close();
    }
}
