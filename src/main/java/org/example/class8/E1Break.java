package org.example.class8;

import java.util.Scanner;

public class E1Break {
    public static void main(String[] args) {
        /*
        Search for the name Iram if it's present
        print on the console name is present;
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("What name are you searching?");
        String sName = scan.next();

        String[] names = new String[7];

        names[0] = "James";
        names[1] = "Iram";
        names[2] = "Matt";
        names[3] = "Naugty";
        names[4] = "Aladin";
        names[5] = "Ana";
        names[6] = "Silvia";

        for(String name:names){
            if(name.equalsIgnoreCase(sName)){
                System.out.println("Name is Present");
                break;
            }
        }
    }
}
