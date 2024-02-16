package com.blikeng.Algorithms.Sorters;

public class BubbleSort {
    public static void IntegerSort(int[] array){
        int tmp;
        int size = array.length;
        boolean swapped;

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < size - 1; i++) {
            swapped = false;

            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        Long endTime = System.currentTimeMillis();

        System.out.println("Bubble Sort used " + (endTime - startTime) + "ms to sort " + array.length + " numbers");
    }
}
