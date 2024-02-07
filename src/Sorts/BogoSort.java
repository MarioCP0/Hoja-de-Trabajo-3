package Sorts;



public class BogoSort<T extends Comparable<T>> {
    public void sort(T[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    private boolean isSorted(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    private void shuffle(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int) (Math.random() * arr.length);
            T temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
}