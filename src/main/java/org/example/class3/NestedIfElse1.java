package org.example.class3;

public class NestedIfElse1 {
    public static void main(String[] args) {
    // Nested If Else Statements - using if else statements inside if else statements;

        int age = 31;

        if(age<=20){
            System.out.println("You can change your gender!");
        }
        else if (age>20 && age<31){
            System.out.println("You still can try to change your gender but it's going to be hard!");
        }
        else{
            System.out.println("Better don't even try!");
        }


    }
}
