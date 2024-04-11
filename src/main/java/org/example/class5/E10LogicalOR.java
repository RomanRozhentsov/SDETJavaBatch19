package org.example.class5;

public class E10LogicalOR {
    public static void main(String[] args) {

        boolean flowers = false;
        boolean chocolates = false;
        boolean giveCreditCard = true;
    /*
       As long as one condition is true,
       entire condition is true;
     */

        if(flowers || chocolates || giveCreditCard){
            System.out.println("Wife is Happy");
        }
        else{
            System.out.println("Wife is Sad");
        }
    }
}
