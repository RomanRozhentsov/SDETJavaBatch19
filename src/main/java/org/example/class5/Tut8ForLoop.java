package org.example.class5;

public class Tut8ForLoop {
    public static void main(String[] args) {

        /*
        Ex:
        for (variable; condition; change){
            statement(s)
        }
        The statement(s) will keep executing as long
        as the condition evaluates to true;
         */
        /*
        For Loop VS While Loop:
        int i = 1;
        while(i<=5){
            statement(s)
            i++;
        }
        AND
        for(int i = 1; i<=5; i++){
            statement(s)
        }
         */
        // The variable can be declared and set inside:
        for(int i = 1; i<=5; i++){
            System.out.println("Hello "+i);
        }
        // System.out.println("Hello "+i); - ERROR
        // "i" - can be accessed only within the loop.

        // The variable can be declared outside and set inside:
        int a;
        for(a = 1; a<=5; a++){
            System.out.println("Hello "+a);
        }
        System.out.println("Hello "+a); // Hello 6
        // "a" - can be accessed outside the loop;

        // The variable can be initialized outside:
        int b = 1;
        for( ; b<=5; b++){
            System.out.println("Hello "+b);
        }
        System.out.println("Hello "+b); // Hello 6
        // "b" - can be accessed outside the loop;

        // c++ and ++c are the same:
        int c = 1;
        for( ; c<=5; ++c){
            System.out.println("Hello "+c);
        }

        /*
        Example by steps:
        1) variable - for(i = 1;
        2) condition - i<=5;
        3) statement - ("Hello "+i)
        4) change - i++
         */

        //Infinite for loop:
        /*
        for( ; ; ){
            System.out.println("Hello");
        }

        OR

        for( ; true; ){
            System.out.println("Hello");
        }
         */

        // How to use For Loop like While Loop:
        // For Loop:
        int e = 1;
        for( ; e<=5; ){
            System.out.println("Hello");
            e++;
        }

        // While Loop:
        int f = 1;
        while(f<=5){
            System.out.println("Hello");
            f++;
        }
    }
}
