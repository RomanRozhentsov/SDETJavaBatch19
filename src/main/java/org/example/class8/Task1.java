package org.example.class8;

public class Task1 {
    public static void main(String[] args) {
        // Sum all numbers in 2D array;
        int[][] matrix = {
                {15, 20, 13, 76},
                {20, 33, 49, 60},
                {33, 56, 75, 10}
        };

        int sum = 0;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                sum = sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
