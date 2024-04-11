package org.example.class4;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print a whole number, i will check if it's positive or negative: ");
        double number = scan.nextInt();

        if(number>0){
            System.out.println("Your number is positive!");
        }
        else if(number==0)
            System.out.println("Your number neither positive nor negative!");
        else {
            System.out.println("Your number is negative!");
        }
    }
}
