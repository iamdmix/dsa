import java.util.*;

/**
 * First Program in Java!! Yaay!
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        String inp = input.nextLine();
        input.close();
        System.out.println(inp);
    }
}