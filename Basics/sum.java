//To find the sum of two numbers that are taken from the user
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //To create a scanner object to get input from user
        Scanner scanner = new Scanner(System.in);
        
        //To get input of the first number
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        //To get input of the second number
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        //To calculate the sum of two numbers
        int sum = num1 + num2;

        //To print the sum of the two numbers
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " +sum );

        //To close the scanner to prevent resource leak
        scanner.close();

    }    
}
