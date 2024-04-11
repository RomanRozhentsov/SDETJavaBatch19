package org.example.class5;

public class Tut4WhileLoop {
    public static void main(String[] args) {

        // Loops are used to execute a block of code more than once;
        /*
        Types:
        - While loop
        - Do while loop
        - For loop

        While loop:
        While(boolean-expression)
            statement

        While(boolean-expression){
            statement(s)
            }

        The statement(s) will keep executing as long as
        the boolean-expression evaluates to true.
        Each execution is called an iteration.
         */
        int i = 1; // Used in the condition;

        while(i<=5){
            System.out.println("Hello "+i);
            i++; // Affects the condition;
        }
    }
}
