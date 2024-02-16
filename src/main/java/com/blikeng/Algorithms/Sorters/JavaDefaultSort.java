package com.blikeng.Algorithms.Sorters;

import com.blikeng.Algorithms.Tools.NumberFormatter;

import java.util.Arrays;

public class JavaDefaultSort {
    public static void sort(int[] array){
        if (array == null || array.length <= 1){
            return;
        }

        Long start = System.currentTimeMillis();

        javaDefaultSort(array);

        Long end = System.currentTimeMillis();
        System.out.println("Basic Sort used " + (end - start) + "ms to sort " + NumberFormatter.format(array.length) + " numbers");
    }

    public static void javaDefaultSort(int[] array){
        Arrays.sort(array);
    }
}
