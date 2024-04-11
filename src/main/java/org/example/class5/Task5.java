package org.example.class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of worked years:");
        double years = scan.nextDouble();
        System.out.println("Please enter the number of annual salary:");
        int salary = scan.nextInt();

        if(years>=5){
            System.out.println("Congrats, you are eligible for the bonus!");
            if(years>=5 && salary>50000){
                System.out.println("Your bonus is $5000!");
            }else{
                System.out.println("Your bonus is $3000!");
            }
        }
        else{
            System.out.println("You are not eligible for the bonus.");
        }
    }
}
