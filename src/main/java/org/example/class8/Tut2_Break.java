package org.example.class8;

import java.util.Scanner;

public class Tut2_Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        I i want to get print statement outside the loop
        i need to declare variable - outside the loop;
        otherwise i have to declare a variable inside the loop;
         */

        int n;
        while(true){
            System.out.print("Enter a number between 1 and 10: ");
            n = scan.nextInt();
            if(n<1 || n>10){
                continue;
            }
            System.out.println(n+" is between 1 and 10!");
            break;
        }
    }
}
