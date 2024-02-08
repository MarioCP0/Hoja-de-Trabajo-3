package Tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import Sorts.*;

public class TestingSorts {

    @Test
    public void testQuicksort() {
        Integer[] arr = { 3, 2, 1, 5, 4 };
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        Quicksort<Integer> quick = new Quicksort<Integer>();
        quick.sort(arr);
        assertTrue(Arrays.equals(arr, arr1));
    }

    @Test
    public void testGnomeSort() {
        Integer[] arr = { 3, 2, 1, 5, 4 };
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        GnomeSort<Integer> gnome = new GnomeSort<Integer>();
        gnome.sort(arr);
        assertTrue(Arrays.equals(arr, arr1));
    }

    @Test
    public void testRadixSort() {
        Integer[] arr = { 3, 2, 1, 5, 4 };
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        RadixSort<Integer> radix = new RadixSort<Integer>();
        radix.sort(arr);
        assertTrue(Arrays.equals(arr, arr1));
    }

    @Test
    public void testMergeSort() {
        Integer[] arr = { 3, 2, 1, 5, 4 };
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        MergeSort<Integer> merge = new MergeSort<Integer>();
        merge.sort(arr);
        assertTrue(Arrays.equals(arr, arr1));
    }

    @Test
    public void testBogoSort() {
        Integer[] arr = { 3, 2, 1, 5, 4 };
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        BogoSort<Integer> bogo = new BogoSort<Integer>();
        bogo.sort(arr);
        assertTrue(Arrays.equals(arr, arr1));
    }

}