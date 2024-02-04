import Sorts.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = FileSort.loadfile();

        Quicksort.quicksort(arr, 0, arr.length - 1);
        MergeSort.sort(arr, 0, arr.length - 1);
        RadixSort.sort(arr);
        GnomeSort.sort(arr);
        BogoSort.sort(arr);

    }
}
