package org.example.class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the gender m/f");
        /*
        "next" is going to pick the first word
        and "charAt(0)" is going to pick the first
        letter from that word;
         */
    // for ONE character:
        char gender = scan.next().charAt(0);
        System.out.println(gender);
    }
}
