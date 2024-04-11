package org.example.class5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your month of birth:");
        String month = scan.next();

        if(month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")){
            System.out.println("The season of your birth is Spring");
        }else if(month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august")){
            System.out.println("The season of your birth is Summer");
        }else if(month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("november")){
            System.out.println("The season of your birth is Autumn");
        }else if(month.equalsIgnoreCase("december") || month.equalsIgnoreCase("january") || month.equalsIgnoreCase("february")){
            System.out.println("The season of your birth is Winter");
        }else{
            System.out.println("Invalid");
        }

        // Method which convert all letters from users input to lower case:
        // String month = scan.nextLine().toLowerCase();


    }
}
