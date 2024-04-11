package org.example.class3;

public class IfElseIf2 {
    public static void main(String[] args) {
        /*
        If statement - a conditional statement where if the condition is met,
        then an action happens.
        Comparison operators:
        Less than - <
        Greater than - >
        Less than or equal to - <=
        Greater than or equal to - >=
        Equal to - ==
        Not equal to - !=


         */
        // EXAMPLE1
        float money = 5.75F;
        boolean haveDrink = false;

        if(money>=4.95){
            haveDrink = true;
        }
        System.out.println(haveDrink);

        // EXAMPLE2
        float money1 = 3.50F;
        boolean inStock = true;

        if(money1>=4.95 && inStock == true){
            System.out.println("Good");
        }

        // && - and
        // EXAMPLE3
        float money2 = 5.75F;
        boolean inStock1 = true;
        boolean buyDrink;

        if(money2 >= 4.95 || inStock1 == true){
            System.out.println("Good1");
        }
        // || - or
        //EXAMPLE3
        float money3 = 0.75F;
        if (!(money3 >= 4.95)){
            System.out.println("Sad");
        }


    }

}
