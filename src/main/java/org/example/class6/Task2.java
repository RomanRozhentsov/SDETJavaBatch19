package org.example.class6;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a grade: ");
        char grade = scan.next().toLowerCase().charAt(0);

        switch (grade){
            case 'a':
                System.out.println("You Entered "+grade);
                System.out.println("A - Excellent");
            break;
            case 'b':
                System.out.println("You Entered "+grade);
                System.out.println("B - Good");
            break;
            case 'c':
                System.out.println("You Entered "+grade);
                System.out.println("C - Average");
            break;
            case 'd':
                System.out.println("You Entered "+grade);
                System.out.println("D - Bad");
            break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
