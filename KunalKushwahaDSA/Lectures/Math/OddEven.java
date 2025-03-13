//Take input of a number and check whether it is even or odd

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //To create a scanner object to take input from user
        Scanner in = new Scanner(System.in);

        //To input the number from user
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        isOdd(n);
        
        //To close Scanner object to prevent resource leak
        in.close();


    }

    public static void isOdd(int n) {
        if((n&1)==1){
            System.out.print("The number is odd");
        }
        else{
            System.out.print("The number is even");
        }
    }
}
