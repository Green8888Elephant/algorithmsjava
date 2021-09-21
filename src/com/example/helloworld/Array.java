package com.example.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        HelloWorld.msg();
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Length: ");
        int length = in.nextInt();

        int [] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(rnd.nextInt(10));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] = array[i] / 2;
            } else {
                array[i] = array[i] + 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }



    }
}
