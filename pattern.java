import java.util.*;

public class pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;

        // hollow butterfly
        // Upper half

        for (int i = 1; i <= n; i++) {

            // left part
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right part
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // lower half

        for (int i = n; i >= 1; i--) {

            // left part
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right part
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // hollow rhombus

        /*
         * for (int i = 1; i <= n; i++) {
         * // spaces
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= n; j++) {
         * // star
         * if (i == 1 || i == n || j == 1 || j == n) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         */

        // pascals's triangle
        /*
         * for (int i = 0; i < n; i++) {
         * 
         * for (int j = 0; j < n - i; j++) {
         * // spaces
         * System.out.print(" ");
         * }
         * 
         * // numbers
         * int num = 1;
         * for (int j = 0; j < i; j++) {
         * System.out.print(num + " ");
         * num = num * (i - j) / (j + 1);
         * }
         * System.out.println();
         * }
         */

        // half pyramid

        /*
         * for (int i = 1; i <= n; i++) {
         * 
         * // spaces
         * for (int j = 1; j <= n - i; j++) {
         * 
         * System.out.print(" ");
         * }
         * 
         * // numbers
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j + " ");
         * 
         * }
         * System.out.println();
         * }
         */

        // inverted half pyramid
        /*
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = i; j <= n; j++) {
         * System.out.print(i + " ");
         * }
         * System.out.println();
         * }
         */
        sc.close();
    }
}