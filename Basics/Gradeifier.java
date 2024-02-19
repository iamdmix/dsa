//Grade+Identifier

import java.util.Scanner;

public class Gradeifier {
    public static void main(String[] args) {
        // Creating a Scanner object to get the input from the user
        Scanner in = new Scanner(System.in);

        // To input grade from the user
        System.out.print("Enter your grade in numbers: ");
        int g = in.nextInt();

        // To display the grade to the user
        switch (g) {
            case 1: {
                System.out.println("Elementary Shcool");
                break;
            }
            case 2: {
                System.out.println("Middle School");
                break;
            }
            case 3: {
                System.out.println("High School");
                break;
            }
            case 4: {
                System.out.println("College");
                break;
            }
            case 5: {
                System.out.println("University");
                break;
            }
            default: {
                System.out.println("Invalid Grade");
                break;
            }
        }

        // To close the Scanner object to prevent resource leak
        in.close();
    }
}
