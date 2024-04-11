package org.example.class6;

public class Tut3NestedLoops {
    public static void main(String[] args) {
        /*
        NESTED LOOPS:
        A loop can be nested inside another loop.
        Nested Loops consist of an outer loop and one
        or more inner loops.
        Each time the outer loop is executed, the inner
        loops are executed again.
         */
        //Example1:
        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                System.out.println(i+" "+j);
            }
            System.out.println();
        }
        //Example2:
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        NOTE:
        The name of the variable in the outer loop must be
        different than the inner loop;
        for(int i = 1; i<= 10; i++){
            for(int i = 1; j<=10; j++) - ERROR
        }
         */

    }
}
