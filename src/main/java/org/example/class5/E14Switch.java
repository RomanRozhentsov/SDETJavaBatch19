package org.example.class5;

public class E14Switch {
    public static void main(String[] args) {

        int day = 3;
    // Debug to see differences between IfElseIf and Switch statement;
    // Switch checks only Equality;
    // Switch don't support all of a data type;
    // Switch don't support logical operators etc

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid");
        }
    }
}
