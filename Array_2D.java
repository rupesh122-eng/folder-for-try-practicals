import java.util.*;

//  Taking a matrix as an input and printing its elements.
/*
public class Array_2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows size: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns size: ");
        int cols = sc.nextInt();

        System.out.println("Enter the numbers of rows and columns: ");
        int[][] numbers = new int[rows][cols];

        // INPUT
        // rows
        for (int i = 0; i < rows; i++) {

            // columns
            for (int j = 0; j < cols; j++) {

                numbers[i][j] = sc.nextInt();
            }
        }

        // OUTPUT
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
*/

//  Searching for an element x in a matrix.
/* 
public class Array_2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows size: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns size: ");
        int cols = sc.nextInt();

        System.out.println("Enter the numbers of rows and columns: ");
        int[][] numbers = new int[rows][cols];

        // INPUT
        // rows
        for (int i = 0; i < rows; i++) {

            // columns
            for (int j = 0; j < cols; j++) {

                numbers[i][j] = sc.nextInt();
            }
        }

        // Searching input value
        System.out.print("Enter the value to be search: ");
        int key = sc.nextInt();

        // OUTPUT
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(numbers[i][j] + " ");
                if (numbers[i][j] == key) {
                    System.out.println("The element found at index (" + i + ", " + j + ")");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
*/

//  Print the spiral order matrix as output for a given matrix of numbers. 
/*
public class Array_2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows size: ");
        int n = sc.nextInt();

        System.out.print("Enter columns size: ");
        int m = sc.nextInt();

        System.out.println("Enter the numbers of rows and columns: ");
        int[][] matrix = new int[n][m];

        // INPUT
        // rows
        for (int i = 0; i < n; i++) {

            // columns
            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");

        int rowStart = 0;

        int rowEnd = n - 1;

        int colStart = 0;

        int colEnd = m - 1;

        // To print spiral order matrix

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // 1. Top Row
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }

            rowStart++;

            // 2. Right colums
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }

            colEnd--;

            // 3. Bottom row
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }

            rowEnd--;

            // 4. Left column
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }

            colStart++;

            System.out.println();
        }

        sc.close();
    }
}
*/

//  For a given matrix of N x M, print its transpose.

public class Array_2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows size: ");
        int n = sc.nextInt();

        System.out.print("Enter columns size: ");
        int m = sc.nextInt();

        System.out.println("Enter the numbers of rows and columns: ");
        int[][] matrix = new int[n][m];

        // INPUT
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose is: ");

        // To print transpose

        for (int j = 0; j < m; j++) {

            for (int i = 0; i < n; i++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
