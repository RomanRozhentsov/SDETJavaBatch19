package org.example.class5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        double num = scan.nextDouble();

        if(num>=1 && num<=10){
            System.out.println("Small number");
        }
        else if(num>=11 && num<=100){
            System.out.println("Medium number");
        }
        else if(num>=101 && num<=1000){
            System.out.println("Large number");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
