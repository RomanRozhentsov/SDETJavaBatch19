package org.example.class5;

public class Tut6DoWhileLoop {
    public static void main(String[] args) {
        /*
        E1:
        do
            statement
        while(boolean-expression);

        E2;
        do{
            statement(s)
        } while(boolean-expression);

        The statement(s) will keep executing as long as
        the boolean-expression evaluates to true;
         */

        int i = 1;
        do{
            System.out.println("Helolo "+i);
            i++;
        }while(i<=3);

        /*
        While vs Do While:

        While: check condition then execute;
        Do While: execute then check condition;

        For Example:
         */
        // 1) 0 iteration;
        int a = 100; // a<= 5 is false;
        while(a<=5){
            System.out.println("Hello "+a);
            a++;
        }
        // 2) 1 iteration;
        int b = 100; // b <= 5 is false;
        do{
            System.out.println("Hello "+b);
            b++;
        }while(b<=5);
        
    }
}
