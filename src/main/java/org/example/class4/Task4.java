package org.example.class4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a degree?");
        System.out.println("1 - yes");
        System.out.println("2 - no");

        int degree = scan.nextInt();

        if(degree==1){
            System.out.println("Congratulations!");
            System.out.println("What's your GPA score?");
            double gpa = scan.nextDouble();

            if(gpa>=3.5){
                System.out.println("You are eligible for scholarship!");
            }else{
                System.out.println("You should have studied harder!");
            }
        }else if(degree==2){
            System.out.println("You should get a degree!");
        }
        else{
            System.out.println("Try again!");
        }

    }
}
