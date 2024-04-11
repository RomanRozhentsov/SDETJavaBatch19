package org.example.class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
    // two scanner objects only for next.Line method;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please Enter your Age");
        int age = scan1.nextInt();
        System.out.println("Please Enter your Full Name");
        String fullName = scan2.nextLine();
        System.out.println("Your Full Name is "+fullName+" and your age is "+age+" years old");
    }
}
