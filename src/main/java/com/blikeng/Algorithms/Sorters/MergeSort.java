package com.blikeng.Algorithms.Sorters;

import com.blikeng.Algorithms.Tools.NumberFormatter;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] array){
        if (array == null || array.length <= 1) {
            return;
        }

        Long start = System.currentTimeMillis();

        mergeSort(array, 0, array.length - 1);

        Long end = System.currentTimeMillis();
        System.out.println("Merge Sort used " + (end - start) + "ms to sort " + NumberFormatter.format(array.length) + " numbers");
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        Arrays.fill(L, array[left + 1]);

        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]){
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
