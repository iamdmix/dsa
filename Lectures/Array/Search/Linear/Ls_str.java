//To return true if char is in string else false
import java.util.Scanner;

public class Ls_str {
    public static void main(String[] args) {
        //To create a scanner object to read input from the user  
        Scanner in = new Scanner(System.in);

        //To input the String
        System.out.print("Enter a String: ");
        String n = in.nextLine();

        // To input the search character
        System.out.print("Enter the search character: ");
        char ele = in.next().charAt(0);

        // To perform Linear Search
        System.out.println(search(n, ele));

        // To close Scanner object to prevent resource leak
        in.close();
    }

    static boolean search(String str, char ele){
        //The string must obviosly have some characters in it
        if(str.length()==0){
            return false;
        }

        //To check against each character of the string
        for (char ch : str.toCharArray()) {
            if(ch == ele){
                return true;
            }
        }
        
        //If none of the above then:
        return false;
    } 
}
