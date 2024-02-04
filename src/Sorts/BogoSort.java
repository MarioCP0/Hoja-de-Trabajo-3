package Sorts;

public class BogoSort{
    public static void sort(int[] arr){
        while(!isSorted(arr)){
            shuffle(arr);
        }
    }

    private static void shuffle(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int randomIndex = (int)(Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    private static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}