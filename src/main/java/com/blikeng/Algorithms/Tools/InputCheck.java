package com.blikeng.Algorithms.Tools;

import java.util.Scanner;

public class InputCheck {
    public static int checkInput(){
        System.out.println("How big array do you want?");

        while (true){
            Scanner scanner = new Scanner(System.in);

            String inputString = scanner.nextLine();

            if (inputString != null && !inputString.isEmpty()){
                try {
                    return Integer.parseInt(inputString);
                } catch (Exception error) {
                    System.out.println("Please enter a number");
                }
            } else {
                System.out.println("Please enter something");
            }
        }
    }
}
