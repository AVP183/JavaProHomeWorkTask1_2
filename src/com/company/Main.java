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

        System.out.println("Task 6");
        int sizeArray = 10;
        int[] arrayOne = new int[sizeArray];
        int[] arrayTwo = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arrayOne[i] = random.nextInt(1, 15);
            arrayTwo[i] = random.nextInt(1, 15);
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        int arraysSameValue = 0;
        for (int i = 0; i < sizeArray; i++) {
            boolean flagSameCheck = false;
            for (int j = 0; j < sizeArray; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    arraysSameValue = arrayTwo[j];
                    flagSameCheck = true;
                    break;
                }
            }
            if (flagSameCheck) {
                System.out.print(arraysSameValue + " ");
            }
        }


        System.out.println("\nTask 7");
        int sizeDifferentArrays = 10;
        int[] arrayFirst = new int[sizeDifferentArrays];
        int[] arraySecond = new int[sizeDifferentArrays];
        for (int i = 0; i < sizeDifferentArrays; i++) {
            arrayFirst[i] = random.nextInt(1, 15);
            arraySecond[i] = random.nextInt(1, 15);
        }
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));
        int firstDiffrentValue = 0;
        int seconDifferentValue = 0;
        for (int i = 0; i < sizeDifferentArrays; i++) {
            int counterFirstDiffrent = 0;
            int counterSecondDiffrent = 0;
            int aa = 0;
            boolean ttt = false;
            for (int j = 0; j < sizeDifferentArrays; j++) {
                if (arrayFirst[i] == arraySecond[j]) {
                    counterFirstDiffrent++;
                    //break;
                } else {
                    firstDiffrentValue = arrayFirst[i];
                }
                if (arraySecond[i] == arrayFirst[j]) {
                    counterSecondDiffrent++;
                    //break;
                } else {
                    seconDifferentValue = arraySecond[i];
                }
            }

            if (counterFirstDiffrent < 1) {
                System.out.print(firstDiffrentValue + " ");
            }
            if (counterSecondDiffrent < 1) {
                System.out.print(seconDifferentValue + " ");
            }

        }
    }
}
