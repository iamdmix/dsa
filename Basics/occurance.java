
//To find the occurances of a digit in a given number n, taken from the user
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        // To create Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // To take input of num and n from the user
        System.out.print("Enter the number: ");
        long num = in.nextLong();
        System.out.print("Enter the digits: ");
        int n = in.nextInt();

        // To find the number of occurances of n
        int occ = 0;
        int rem = 0;
        while (num > 0) {
            rem = (int) (num % 10);

            if (rem == n) {
                occ++;
            }
            num /= 10;
        }

        // To print the number of occurances
        System.out.println(n + " Occurs " + occ + " times in the given number");

        // To close the Scanner object to prevent resource leak
        in.close();
    }
}
