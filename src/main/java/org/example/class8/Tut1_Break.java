package org.example.class8;

public class Tut1_Break {
    public static void main(String[] args) {
        /*
        Break and Continue:
        Special keywords that can be used within loops;
        Break: exits the loop regardless of the condition;
        Continue: skips the rest of the loop's body.
        Continue executing the loop as if we finished
        executing the body.

        *For Loop: execute change;
        *While and Do While Loops: check conditions.
         */

        //Example:

        for(int i = 1; i<=10; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
