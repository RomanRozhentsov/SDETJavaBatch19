package org.example.class8;

public class Tut6_2DArrays {
    public static void main(String[] args) {

        // 2D Array - an array of arrays;
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };

        for(int i = 0; i< cars.length; i++){
            System.out.println();
            for(int j = 0; j< cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}
