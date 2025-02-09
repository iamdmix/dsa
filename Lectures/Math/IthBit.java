//Given a number return it's i'th bit

import java.util.Scanner;

public class IthBit {
    public static void main(String[] args) {
        //To create a scanner object to get input from the user
        Scanner in = new Scanner((System.in));
        
        //To take input of values from user
        System.out.print("Enter the number followed by the i'th position: ");
        int n = in.nextInt();
        int i = in.nextInt();

        findbit(n,i);
        
        //To close Scanner object to prevent resource leak
        in.close();
    }

    public static void findbit(int n, int i){
        int mask = 1<<(i-1);
        int ans = (n&mask);
        System.out.print("The i'th bit is: "+ans);
    }
}
