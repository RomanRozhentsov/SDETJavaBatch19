package org.example.class5;

import java.util.Scanner;

public class Tut7DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            num = scan.nextDouble();
        } while (num<1 || num > 10);

        System.out.println(num+" is between 1 and 10");

    }
}
