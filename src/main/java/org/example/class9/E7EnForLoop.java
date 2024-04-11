package org.example.class9;

public class E7EnForLoop {
    public static void main(String[] args) {
        // Write a program to calculate the avg of
        // these numbers using Enhanced For Loop:
        int[] numbers = {10,25,45,66,85,100};

        int sum = 0;
        for(int n:numbers){
            sum = sum+n;
        }
        int avg = sum/numbers.length;
        System.out.println(avg);

    }
}
