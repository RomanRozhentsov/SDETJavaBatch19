package org.example.class3;
import java.util.Scanner;
public class ScannTut {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("What's your first name?");
        String firstName = scan.next();

        System.out.println("What's your age?");
        int age = scan.nextInt();

        System.out.println("What's your senior quote?");
        String quote = scan.next();
        //quote = quote + scan.nextLine();
        //OR
        quote += scan.nextLine();

        System.out.println("Thank you "+firstName+"!");
        System.out.println("Btw, your age is "+age+")");
        System.out.println("And... I like this quote: "+quote+"))");




    }
}
