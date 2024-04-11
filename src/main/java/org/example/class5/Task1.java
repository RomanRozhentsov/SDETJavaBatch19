package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is amount of loan is needed?");
        double loan = scan.nextDouble();

        if(loan<=200000){
            System.out.println("I would lend the money");
        }
        else{
            System.out.println("I would reject the client");
        }
    }
}
