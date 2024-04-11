package org.example.class9;

public class E1Array {
    public static void main(String[] args) {

        int[] numbers = {10,25,45,66,85,100};
        // How many elements in an array:
        System.out.println(numbers.length);
        // To show opposite variable:
        System.out.println(numbers[3]);
        //System.out.println(numbers[-5]);
        // If we have a lot of elements in an array:
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+"-"+" "+numbers[i]+" ");
        }

    }
}
