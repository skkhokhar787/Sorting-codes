public class QuickSort {
    public static int partition (int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // blank space for pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    public static void quiSort (int [] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = partition (arr, low ,high);

            quiSort(arr, low, pivotIdx-1);
            quiSort(arr, pivotIdx+1, high);
        }

    }
    public static void main (String [] args) {
        int [] arr = {6,3,9,5,2,8};
        int n = arr.length;

        quiSort(arr,0,n-1);

        //print

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
