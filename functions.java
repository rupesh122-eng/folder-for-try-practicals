import java.util.*;

public class functions {

    public static void printPrime(int n) {
        boolean prime = n >= 2;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a number");
        int n = sc.nextInt();

        // System.out.print("Enter 2nd number: ");
        // int m = sc.nextInt();

        printPrime(n);

        sc.close();
    }
}
