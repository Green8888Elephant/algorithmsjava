package com.example.helloworld;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

    }
    public static void msg() {
        int max, min;
        Random rnd = new Random();

        Scanner in = new Scanner(System.in);
        System.out.println("Input a Columns: ");
        int columns = in.nextInt();
        System.out.println("Input a Rows: ");
        int rows = in.nextInt();
        System.out.println("Input a MinNum: ");
        int minNum = in.nextInt();
        System.out.println("Input a MaxNum: ");
        int maxNum = in.nextInt();

        int [][] array = new int[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.round(rnd.nextInt(10) * (maxNum - minNum)/10) + minNum;
            }
        }



        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
        }

        System.out.println("");
        System.out.println("");

        System.out.println("---------------------------");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][i] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
        }



        System.out.println(array);
    }
}


