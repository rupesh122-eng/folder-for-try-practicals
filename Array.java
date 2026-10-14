import java.util.*;

// 1. Take an array of names as input from the user and print them on the screen.
/*
public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array name: ");
        int size = sc.nextInt();

        System.out.println("Enter the names : ");
        String names[] = new String[size];

        // input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // output
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is " + names[i]);
        }
        sc.close();
    }
}
*/

//  2. Find the maximum & minimum number in an array of integers. 
/*
public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array numbers: ");
        int size = sc.nextInt();

        System.out.print("Enter the numbers : ");
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // output
        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);

        sc.close();
    }
}
*/

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array numbers: ");
        int size = sc.nextInt();

        System.out.print("Enter the numbers : ");
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < numbers.length - 1; i++) { // NOTICE ==> numbers.length - 1 as termination condition.

            if (numbers[i] > numbers[i + 1]) { // This is the condition for descending order.
                isAscending = false;
            }
        }

        // output
        if (isAscending) {
            System.out.println("This array is sorted in ascending order");
        } else {
            System.out.println("This array is not sorted in ascending order");
        }

        sc.close();
    }
}
