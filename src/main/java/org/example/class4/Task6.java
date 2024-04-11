package org.example.class4;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You decided to donate your blood. That's awesome!");
        System.out.println("But first we need information from you.");
        System.out.println("What's your age?");
        double age = scan.nextDouble();
        if(age>=18){
            System.out.println("Your age is eligible for blood donation.");
            System.out.println("Now we need to know your weight?");
            double weight = scan.nextDouble();
            if(weight>110){
                System.out.println("You are eligible!");
            }else{
                System.out.println("We can't accept such a patient.");
            }
        }else{
            System.out.println("We can't accept such a patient.");
        }
    }
}
