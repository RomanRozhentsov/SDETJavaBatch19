package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = scan.nextInt();
        System.out.println("Please Enter your FullName");
    /* if I use methods: nextInt, nextDouble, nextBoolean...
       before nextLine method i will not be able to entering
       anything that i want; to solve this problem i can use
       next.Line method twice or (see in E7Scanner);
       Extra call to nextLine to clear the buffer memory;
     */
        scan.nextLine();
        String fullName = scan.nextLine();
        System.out.println("Your name is "+fullName+" your age is "+age+" years old");

    }
}
