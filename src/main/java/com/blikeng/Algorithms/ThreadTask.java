package com.blikeng.Algorithms;

import com.blikeng.Algorithms.Enums.SortingEnum;
import com.blikeng.Algorithms.Sorters.*;

import java.util.Arrays;

public class ThreadTask {
    public static void StartThreads(int[] intArray) {
        SortingTask Bubble = new SortingTask(intArray, SortingEnum.BUBBLE_SORT);
        SortingTask JavaDef = new SortingTask(intArray, SortingEnum.JAVA_DEFAULT_SORT);
        SortingTask Merge = new SortingTask(intArray, SortingEnum.MERGE_SORT);
        SortingTask Quick = new SortingTask(intArray, SortingEnum.QUICK_SORT);
        SortingTask Heap = new SortingTask(intArray, SortingEnum.HEAP_SORT);

        Thread thread1 = new Thread(Bubble);
        Thread thread2 = new Thread(JavaDef);
        Thread thread3 = new Thread(Merge);
        Thread thread4 = new Thread(Quick);
        Thread thread5 = new Thread(Heap);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static class SortingTask implements Runnable {
        private final int[] array;
        private final SortingEnum sortingAlgorithm;

        public SortingTask(int[] array, SortingEnum sortingAlgorithm) {
            this.array = Arrays.copyOf(array, array.length);
            this.sortingAlgorithm = sortingAlgorithm;
        }

        @Override
        public void run() {
            switch (sortingAlgorithm) {
                case BUBBLE_SORT -> BubbleSort.IntegerSort(array);
                case JAVA_DEFAULT_SORT -> JavaDefaultSort.sort(array);
                case MERGE_SORT -> MergeSort.sort(array);
                case QUICK_SORT -> QuickSort.sort(array);
                case HEAP_SORT -> HeapSort.sort(array);
            }
        }
    }
}
