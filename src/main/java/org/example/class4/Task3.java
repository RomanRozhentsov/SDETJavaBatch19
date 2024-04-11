package org.example.class4;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print a number and i will check it if it's Even or Odd:");
        double number = scan.nextDouble();

        if((number%2)==0){
            System.out.println("Your number is Even!");
        }
        else {
            System.out.println("Your number is Odd");
        }





    }
}
