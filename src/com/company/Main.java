package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        int size = 10;
        int avgArraySum = 0;
        int resault = 0;
        Random random = new Random();
        int[] arraySumFigure = new int[size];
        for (int i = 0; i < arraySumFigure.length; i++) {
            arraySumFigure[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(arraySumFigure));
        for (int i = 0; i < arraySumFigure.length; i++) {
            resault += arraySumFigure[i];
        }
        avgArraySum = resault / size;
        System.out.println("Cреднее арифметическое массива чисел " + avgArraySum);


        System.out.println("Task 2");
        int maxValue = arraySumFigure[0];
        int minValue = arraySumFigure[0];
        for (int i = 0; i < arraySumFigure.length; i++) {
            if (maxValue < arraySumFigure[i]) {
                maxValue = arraySumFigure[i];
            }
            if (minValue > arraySumFigure[i]) {
                minValue = arraySumFigure[i];
            }
        }
        System.out.printf("Максимальный элемент массива = %d и минимальный элемент массивa = %d %n", maxValue,
                minValue);


        System.out.println("Task 3");
        int[] foundRepeatValues = new int[8];
        for (int i = 0; i < foundRepeatValues.length; i++) {
            foundRepeatValues[i] = random.nextInt(1, 5);
        }
        System.out.println(Arrays.toString(foundRepeatValues));
        for (int i = 0; i < foundRepeatValues.length - 1; i++) {
            for (int j = i + 1; j < foundRepeatValues.length; j++) {
                if (foundRepeatValues[i] == foundRepeatValues[j]) {
                    System.out.println("Значение массива " + foundRepeatValues[j] + " повторяется в элементе "
                            + j);
                    break;
                }
            }
        }


        System.out.println("Task 4, 5");
        int maxSecondValue = arraySumFigure[0];
        int minSecondValue = arraySumFigure[0];

        for (int i = 0; i < arraySumFigure.length; i++) {
            if (arraySumFigure[i] < maxValue) {
                if (maxSecondValue < arraySumFigure[i]) {
                    maxSecondValue = arraySumFigure[i];
                }
            }
            if (arraySumFigure[i] > minValue) {
                if (arraySumFigure[i] < minSecondValue) {
                    minSecondValue = arraySumFigure[i];
                }
            }
        }
        System.out.printf("Максимальный второй элемент массива = %d и минимальный второй элемент " +
                        "массивa = %d %n", maxSecondValue, minSecondValue);
    }
}
