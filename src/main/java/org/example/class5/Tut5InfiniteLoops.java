package org.example.class5;

public class Tut5InfiniteLoops {
    public static void main(String[] args) {

        /*
        Infinite loops:
        The condition is always true -> the loop will not stop;
         */
        int i = 1;
        while(i<=5){
            System.out.println("Hello "+i);
        }
        // OR
        while(true){
            System.out.println("Hello");
        }
    }
}
