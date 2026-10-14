public class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j];
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);

            quickSort(arr, pivotIdx + 1, high);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 6, 9, 3 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}