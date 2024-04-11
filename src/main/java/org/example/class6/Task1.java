package org.example.class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Country: ");
        String country = scan.nextLine();

        switch (country){
            case ("Russia"):
                System.out.println("Russian");
            break;
            case ("USA"):
                System.out.println("English");
            break;
            case ("Spain"):
                System.out.println("Spanish");
            break;
            case ("Italy"):
                System.out.println("Italian");
            break;
            case ("Egypt"):
                System.out.println("Arabic");
            break;
            default:
                System.out.println("Country not supported!");
        }
    }
}
