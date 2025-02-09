import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        // Define the limit up to which we want to find prime numbers
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the limit
        System.out.print("Enter the limit: ");
        int n = scanner.nextInt();

        // Call the function with the user's input
        sieveOfEratosthenes(n);
    }

    static void sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize all entries as true.
        // A value in prime[i] will finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;

        // Loop through the numbers up to sqrt(n)
        for(int p = 2; p*p <=n; p++) {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true) {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++) {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
}