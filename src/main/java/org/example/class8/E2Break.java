package org.example.class8;

import java.util.Scanner;

public class E2Break {
    public static void main(String[] args) {

        int[] numbers = new int[8];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 55;
        numbers[4] = 45;
        numbers[5] = 35;
        numbers[6] = 50;
        numbers[7] = 100;

        for(int num: numbers){
            if(num>50){
                continue;
            }
            System.out.println(num+10);
            System.out.println(num*10);
            System.out.println(num%10);
            System.out.println(num/10);
            System.out.println(num*20);
            System.out.println("*****");
        }
    }
}
