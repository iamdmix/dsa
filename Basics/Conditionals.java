//To check if the given number is positive, negative or zero and whether it is odd or even.
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //To create a scanner object to read input from the user  
        Scanner scanner = new Scanner(System.in);

          //To input the integer
          System.out.print("Enter an Integer: ");
          int n = scanner.nextInt();
          
          //To check if the number is negative, positive or zero
          if (n>0){
            System.out.print("The number is positive and ");
          }
          else if(n<0){
            System.out.print("The number is negative and "); 
          }
          else{
            System.out.println("The number is 0");
          }

          //To print if the number is even or odd
          //Here we are using the terenary operator
          String parity = (n%2==0) ? "even" : "odd";  
          System.out.println(parity);

          //To close the scanner to prevent resource leak
          scanner.close();
    }
}
