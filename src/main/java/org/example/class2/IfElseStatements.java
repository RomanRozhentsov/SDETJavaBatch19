package org.example.class2;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade: ");

        int n = scan.nextInt();
        System.out.println(n);

        if(n>=90 && n<=100) {
            System.out.println("a");
        }
        else if(n>=80 && n<=90) {
            System.out.println("b");
        }
        else {
            System.out.println("The number you entered is not in the range!");
        }

    }
}
