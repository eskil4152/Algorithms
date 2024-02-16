package com.blikeng.Algorithms.Sorters;

import com.blikeng.Algorithms.Tools.NumberFormatter;

public class HeapSort {
    public static void sort(int[] array){
        if (array == null || array.length <= 1)
            return;

        Long start = System.currentTimeMillis();

        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);

            heapify(array, i, 0);
        }

        Long end = System.currentTimeMillis();
        System.out.println("HeapSort used " + (end - start) + "ms to sort " + NumberFormatter.format(array.length) + " numbers");
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);

            heapify(array, n, largest);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
