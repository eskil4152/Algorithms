package com.blikeng.Algorithms.Tools;

import java.text.DecimalFormat;

public class NumberFormatter {
    public static String format(int number) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(number);
    }
}
