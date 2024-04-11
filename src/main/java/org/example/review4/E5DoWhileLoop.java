package org.example.review4;

import java.util.Scanner;

public class E5DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // In situation when i need to repeat my code at least once
        // the best choice use Do While Loop;
        System.out.print("Please Enter a number: ");
        int number = scan.nextInt();
        while(number<10){
            System.out.print("Please Enter the number: ");
            number = scan.nextInt();
        }
    }
}
