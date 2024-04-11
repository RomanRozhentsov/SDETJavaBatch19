package org.example.review3;

public class E7LogicalNot {
    public static void main(String[] args) {
        // Logical NOT (!) operator;
        /*
        If someone is exactly 10, 20 or 30 years old, do not give
        discount, otherwise give discount to everyone;
         */

        int age = 10;
        if(age!=10 && age!=20 && age!=30){
            System.out.println("You will get a discount of 20%!");
        }else{
            System.out.println("You can't get a discount");
        }
    }
}
