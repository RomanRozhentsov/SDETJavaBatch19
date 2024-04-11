package org.example.class3;

public class Task1 {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 20.5;
        double addition = num2 + num1;
        System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to: "+addition);
        // OR
        // System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to: "+(num1+num2));
        // If we want to prioritize something we use parenthesis;
        double subtraction = num1 - num2;
        System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to: "+subtraction);
        double multiplication = num1 * num2;
        System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to: "+multiplication);
        double division = num1 / num2;
        System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to: "+division);
    }
}
