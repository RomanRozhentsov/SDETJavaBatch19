package org.example.class4;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is mortgage rate?");
        double rate = scan.nextDouble();

        if(rate<=4.5) {
            System.out.println("Because of rate is "+rate+" you could consider buying.");
            System.out.println("What is the price of the house?");
            int price = scan.nextInt();
            if(price>100000){
                System.out.println("You should take a loan!");
            }else{
                System.out.println("You can pay cash!");
            }
        }else if(rate>4.5) {
            System.out.println("You can't buy a house because of rate!");
        }



    }
}
