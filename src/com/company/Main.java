package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 4;
        int resault = 0;
        Random random = new Random();
	    int[] arraySumFigure = new int[size];
        for (int i = 0; i < arraySumFigure.length; i++) {
            arraySumFigure[i] = random.nextInt(0,100);
        }
        System.out.println(Arrays.toString(arraySumFigure));
        System.out.println(arraySumFigure[0]);
        for (int i = 0; i < arraySumFigure.length; i++) {

//            if (arraySumFigure[i] > 10){
//                resault += arraySumFigure[i] / 10;
//
//                arraySumFigure[i] %10;
//            }

        }
        System.out.println(resault);
    }
}
