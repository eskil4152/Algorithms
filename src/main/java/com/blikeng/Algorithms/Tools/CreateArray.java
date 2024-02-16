package com.blikeng.Algorithms.Tools;

import java.util.Random;

public class CreateArray {
    public static int[] createIntArray(int size){
        Long start = System.currentTimeMillis();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(0, Integer.MAX_VALUE);
        }

        Long end = System.currentTimeMillis();
        System.out.println("Time to create array: " + (end - start) + "ms");

        return array;
    }
}
