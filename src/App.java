import Sorts.*;
import java.util.HashMap;

public class App {
    public static void main(String[] args){
        HashMap<String, HashMap<String, Integer[]>> TimesInMsPerComplexity = new HashMap<String, HashMap<String, Integer[]>>();
        HashMap<String, Integer[]> quicksort = new HashMap<String, Integer[]>();
        HashMap<String, Integer[]> gnomesort = new HashMap<String, Integer[]>();
        HashMap<String, Integer[]> radixsort = new HashMap<String, Integer[]>();
        HashMap<String, Integer[]> mergesort = new HashMap<String, Integer[]>();
        HashMap<String, Integer[]> bogosort = new HashMap<String, Integer[]>();
        Quicksort<Integer> quick = new Quicksort<Integer>();
        GnomeSort<Integer> gnome = new GnomeSort<Integer>();
        RadixSort<Integer> radix = new RadixSort<Integer>();
        MergeSort<Integer> merge = new MergeSort<Integer>();

        for (int i = 1; i < 5001; i++) {

            FileSort.PutRandomNumbers(i);
            Integer[] arr = FileSort.CreateRandomArray(i);


            Integer[] arr1 = arr.clone();
            long startTime1 = System.nanoTime();
            System.out.println(startTime1);
            quick.sort(arr1);
            long endTime1 = System.nanoTime();
            System.out.println(endTime1);
            long duration1 = (endTime1 - startTime1); // Convert to milliseconds
            System.out.println("Quicksort-" + i + " : " + duration1 + "ns");
            quicksort.put(String.valueOf(i), new Integer[] { (int) duration1 });
            TimesInMsPerComplexity.put("Quicksort", quicksort);

            Integer[] arr2 = arr.clone();
            long startTime2 = System.nanoTime();
            gnome.sort(arr2);
            long endTime2 = System.nanoTime();
            long duration2 = (endTime2 - startTime2); // Convert to milliseconds
            System.out.println("GnomeSort-" + i + " : " + duration2 + "ns");
            gnomesort.put(String.valueOf(i), new Integer[] { (int) duration2 });
            TimesInMsPerComplexity.put("GnomeSort", gnomesort);

            Integer[] arr3 = arr.clone();
            long startTime3 = System.nanoTime();
            radix.sort(arr3);
            long endTime3 = System.nanoTime();
            long duration3 = (endTime3 - startTime3); // Convert to milliseconds
            System.out.println("RadixSort-" + i + " : " + duration3 + "ns");
            radixsort.put(String.valueOf(i), new Integer[] { (int) duration3 });
            TimesInMsPerComplexity.put("RadixSort", radixsort);

            Integer[] arr4 = arr.clone();
            long startTime4 = System.nanoTime();
            merge.sort(arr4);
            long endTime4 = System.nanoTime();
            long duration4 = (endTime4 - startTime4); // Convert to milliseconds
            System.out.println("MergeSort-" + i + " : " + duration4 + "ns");
            mergesort.put(String.valueOf(i), new Integer[] { (int) duration4 });
            TimesInMsPerComplexity.put("MergeSort", mergesort);

            // Integer[] arr5 = arr.clone();
            // long startTime5 = System.nanoTime();
            // BogoSort<Integer> bogo = new BogoSort<Integer>();
            // bogo.sort(arr5);
            // long endTime5 = System.nanoTime();
            // long duration5 = (endTime5 - startTime5) / 1000000; // Convert to milliseconds
            // TimesInMsPerComplexity.put("BogoSort-" + i, new Integer[] { (int) duration5 });
        }
        FileSort.SaveTimeCSV(TimesInMsPerComplexity);
    }
}

