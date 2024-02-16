package com.blikeng.Algorithms.Sorters;

import com.blikeng.Algorithms.Tools.NumberFormatter;

public class QuickSort {
    public static void sort(int[] array) {
        if (array == null || array.length <= 1)
            return;

        Long start = System.currentTimeMillis();

        quickSort(array, 0, array.length - 1);

        Long end = System.currentTimeMillis();
        System.out.println("QuickSort used " + (end - start) + "ms to sort " + NumberFormatter.format(array.length) + " numbers");
    }

    private static void quickSort(int[] array, int low, int high){
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (array[j] <= pivot){
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
