package org.example.class6;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator for 2 numbers.");
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("Your result is "+result);
            break;
            case '-':
                result = num1 - num2;
                System.out.println("Your result is "+result);
            break;
            case '*':
                result = num1 * num2;
                System.out.println("Your result is "+result);
            break;
            case '/':
                result = num1 / num2;
                System.out.println("Your result is "+result);
            break;
            default:
                System.out.println("Invalid");
        }
    }
}
