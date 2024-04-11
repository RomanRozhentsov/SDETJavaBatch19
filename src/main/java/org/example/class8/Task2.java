package org.example.class8;

public class Task2 {
    public static void main(String[] args) {
        // Add all the even numbers from 2D array and print the sum:
        int[][] matrix = {
                {15, 20, 13, 76},
                {20, 33, 49, 60},
                {33, 56, 75, 10}
        };

        int sum = 0;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                if(matrix[i][j]%2==0){
                    sum = sum+matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
