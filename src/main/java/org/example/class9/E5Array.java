package org.example.class9;

public class E5Array {
    public static void main(String[] args) {

        int[] numbers = {10,25,45,66,85,100};
        // Write a program to calculate the avg of these numbers:
        int avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg = avg+numbers[i];
        }
        avg = avg/numbers.length;
        System.out.println(avg);

    }
}
