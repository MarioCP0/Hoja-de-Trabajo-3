import Sorts.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = FileSort.loadfile();
        System.out.println("Unsorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int[] arr2 = arr.clone();
        Quicksort.quicksort(arr2, 0, arr.length - 1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        int[] arr3 = arr.clone();
        MergeSort.sort(arr3, 0, arr.length - 1);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        int[] arr4 = arr.clone();
        RadixSort.sort(arr4);
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        int[] arr5 = arr.clone();
        GnomeSort.sort(arr5);
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }

        int[] arr6 = arr.clone();
        BogoSort.sort(arr6);
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + " ");
        }

    }
}
