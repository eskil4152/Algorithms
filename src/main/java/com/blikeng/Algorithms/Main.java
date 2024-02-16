package com.blikeng.Algorithms;

import com.blikeng.Algorithms.Sorters.HeapSort;
import com.blikeng.Algorithms.Sorters.JavaDefaultSort;
import com.blikeng.Algorithms.Sorters.QuickSort;
import com.blikeng.Algorithms.Tools.CreateArray;
import com.blikeng.Algorithms.Tools.InputCheck;
import com.blikeng.Algorithms.Sorters.MergeSort;

public class Main {
    public static void main(String[] args) {
        int input = InputCheck.checkInput();

        if (input < 100_000_000){
            ThreadTask.StartThreads(CreateArray.createIntArray(input));
            return;
        }

        System.out.println("Size over 100K, please be patient");

        int[] array = CreateArray.createIntArray(input);

        HeapSort.sort(array);
        array = null;

        int[] array2 = CreateArray.createIntArray(input);
        JavaDefaultSort.sort(array2);
        array2 = null;

        int[] array3 = CreateArray.createIntArray(input);
        QuickSort.sort(array3);
        array3 = null;

        //int[] array4 = CreateArray.createIntArray(input);
        //MergeSort.sort(array4);
    }
}