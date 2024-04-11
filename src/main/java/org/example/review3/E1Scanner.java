package org.example.review3;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Scanner - name of the class;
        // All the classes in Java also as data types;
        System.out.print("Please Enter your Age: ");
        int age = scan.nextInt();
        /*
        I have created "age" variable which can store int data type
        from users input, for that i have used nextInt() method;
         */
        /*
        We have created a variable of int data type and calling the
        nextInt() method to accept the int type of data and storing
        it in the variable (age);
         */
        // scan - name of the object/variable;
        // nextInt() - method/function;
        if(age>50){
            System.out.println("You will get 20% discount on Toys.");
        }else{
            System.out.println("you will get 10% discount.");
        }
        /*
        If the condition is true the computer will execute first part,
        otherwise computer will execute "else" part;
         */
    }
}
