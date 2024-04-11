package org.example.class8;

import java.util.Scanner;

public class Tut3_Break {
    public static void main(String[] args) {

        for(int i = 1; i<=10; i++){
            if(i==7){
                continue;
            }
            System.out.println("Value is: "+i);
        }
    }
}
