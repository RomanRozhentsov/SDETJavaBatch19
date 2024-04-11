package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a credit card (true/false):");
    /*
        Also I can use "String creditCard = scan.next();
        instead of boolean creditCard = scan.nextBoolean();
        for expecting output: yes or no;
        For if condition: .equals;
        But this method can bring more problem, because of user can
        enter (for example) "yes" instead of "Yes";
        To solve this problem: .equalsIgnoreCase;
     */
        boolean creditCard = scan.nextBoolean();

        if(!(creditCard)){
            System.out.println("Would you like to open credit card (true/false)?");
            boolean newCard = scan.nextBoolean();
            if(newCard){
                System.out.println("Give us a moment");
            }else{
                System.out.println("Ok");
            }
        }
        else{
            System.out.println("What is the balance of the card?");
            int balance = scan.nextInt();
            if(balance>1000){
                System.out.println("Please pay off immediately");
            }else{
                System.out.println("You can spend more");
            }
        }
    }
}
