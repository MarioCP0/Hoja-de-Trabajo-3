package Sorts;

public class RadixSort<T extends Comparable<T>> {
    public void sort(T[] arr) {
        int n = arr.length;
        T max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        for (int exp = 1; ((int) max / exp) > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    private void countSort(T[] arr, int n, int exp) {
        T[] output = (T[]) new Comparable[n];
        int[] count = new int[10];~
        for (int i = 0; i < n; i++) {
            count[((int) arr[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[((int) arr[i] / exp) % 10] - 1] = arr[i];
            count[((int) arr[i] / exp) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
