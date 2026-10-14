// import java.util.*;

public class Sorting {

    public static void main(String[] args) {

        int arr[] = { 7, 8, 1, 3, 2 };

        // Bubble sort
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Selection sort
        for (int i = 0; i < arr.length; i++) {

            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[smallest]) {

                    smallest = j;
                }
            }

            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nSorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // insertion sort

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("\nSorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
