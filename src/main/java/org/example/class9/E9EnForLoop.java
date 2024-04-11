package org.example.class9;

public class E9EnForLoop {
    public static void main(String[] args) {
        /*
        Count how many even numbers are present in the Array:
        (short-cut for Enhanced For Loop: iter + Enter)
         */
        int[] numbers = {10,25,45,66,85,100,26,89,56,33};

        int counter = 0;
        for(int num:numbers){
            if(num%2==0){
                counter++;
                System.out.print(num+", ");
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}
