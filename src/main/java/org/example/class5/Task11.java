package org.example.class5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Quiz score:");
        int quiz = scan.nextInt();
        System.out.println("Please Enter your Mid Term score");
        int midTerm = scan.nextInt();
        System.out.println("Please Enter your Final score");
        int finalScore = scan.nextInt();

        int avg = (quiz+midTerm+finalScore)/3;

        if(avg>=90){
            System.out.println("Your grade is A");
        }else if(avg>=70){
            System.out.println("Your grade is B");
        }else if(avg>=50){
            System.out.println("Your grade is C");
        }else {
            System.out.println("Your grade is F");
        }
    }
}
