package Sorts;

public class GnomeSort<T extends Comparable<T>> {
    public void sort(T[] arr) {
        int i = 1;
        int j = 2;
        while (i < arr.length) {
            if (arr[i - 1].compareTo(arr[i]) <= 0) {
                i = j;
                j++;
            } else {
                T temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            }
        }
    }
}
