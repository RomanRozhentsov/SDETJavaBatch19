package org.example.review3;

import java.util.Scanner;

public class E9Loops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 10;

        for(num = scan.nextInt(); num>5; ){
            System.out.print("Enter the Number: ");
        }
    }
}
