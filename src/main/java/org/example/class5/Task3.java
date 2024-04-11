package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your city: ");
        String city = scan.nextLine();

        System.out.println("What is the temperature in your city? ");
        int tempF = scan.nextInt();
        String temp = " ";

        int tempC = (tempF-32) * 5/9;
        if(tempC>0){
            temp = "+";
        }
        System.out.println("The temperature in the city "+city+" is "+temp+tempC);

    }
}
