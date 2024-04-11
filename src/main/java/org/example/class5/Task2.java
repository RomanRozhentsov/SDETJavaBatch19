package org.example.class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();

        if(age>=18){
            System.out.println("I will issue a driver license to them");
        }
        else{
            System.out.println("I will offer them to get a learners permit");
        }
    }
}
