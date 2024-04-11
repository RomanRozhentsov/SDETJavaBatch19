package org.example.class9;

public class E4Array {
    public static void main(String[] args) {

        int[] numbers = {10,25,45,66,85,100};
        // Reverse order:
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(i+"-"+" "+numbers[i]+" ");
        }

    }
}
