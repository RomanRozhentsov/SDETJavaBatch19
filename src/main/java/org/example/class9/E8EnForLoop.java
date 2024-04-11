package org.example.class9;

public class E8EnForLoop {
    public static void main(String[] args) {
        // Write a program to calculate the avg of
        // numbers which are greater than 25 using
        // Enhanced For Loop:
        int[] numbers = {10,25,45,66,85,100};

        int iterations = 0;
        double sum = 0;
        for(int num:numbers){
            if(num>25){
                iterations++;
                sum+=num;
            }
        }
        double avg = sum/iterations;
        System.out.println("Number of iterations: "+iterations);
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);






    }
}
