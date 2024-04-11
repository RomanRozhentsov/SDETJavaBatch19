package org.example.class6;

import java.util.Scanner;

public class E11Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter the starting point of the Loop: ");
        int start = scan.nextInt();
        System.out.print("Please Enter the stopping number: ");
        int end = scan.nextInt();
        System.out.print("Please Enter the step size: ");
        int stepSize = scan.nextInt();

        while(start<=end){
            System.out.print(start+" ");
            start = start + stepSize;
        }
    }
}
