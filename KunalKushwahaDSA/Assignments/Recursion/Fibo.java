//To print the Fibonacci series for n terms, where n is taken from the user
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        // To create Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // To take input of the last term
        System.out.print("Enter the last term of the series: ");
        int n = in.nextInt();

        // To print the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }

        // To close the scanner to prevent resource leak
        in.close();
    }

    public static int fibonacci(int t) {
        if (t<2){
            return t;
        } else {
            return fibonacci(t - 1) + fibonacci(t - 2); //this is called reccurence relation
        }
    }
}