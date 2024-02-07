import Sorts.*;

public class App {
    public static void main(String[] args){
        Integer[] arr = FileSort.loadfile();

        Integer[] arr1 = arr.clone();
        Quicksort<Integer> quick = new Quicksort<Integer>();
        quick.sort(arr1);

        Integer[] arr2 = arr.clone();
        GnomeSort<Integer> gnome = new GnomeSort<Integer>();
        gnome.sort(arr2);

        Integer[] arr3 = arr.clone();
        RadixSort<Integer> radix = new RadixSort<Integer>();
        radix.sort(arr3);

        Integer[] arr4 = arr.clone();
        MergeSort <Integer> merge = new MergeSort<Integer>();
        merge.sort(arr4);
        
        // Integer[] arr5 = arr.clone();
        // BogoSort<Integer> bogo = new BogoSort<Integer>();
        // bogo.sort(arr5);
    }
}
