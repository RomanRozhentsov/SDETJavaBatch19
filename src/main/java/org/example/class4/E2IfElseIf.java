package org.example.class4;
import java.util.Scanner;
public class E2IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Print any number from 1 to 7!");
        int day = scan.nextInt();

        if(day==1){
            System.out.println("Monday");
        }
        else if (day==2){
            System.out.println("Tuesday");
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        }
        else if (day==5){
            System.out.println("Friday");
        }
        else if (day==6){
            System.out.println("Saturday");
        }
        else if (day==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Wrong number!");
        }

    }
}
