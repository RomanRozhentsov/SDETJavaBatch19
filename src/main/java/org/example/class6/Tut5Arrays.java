package org.example.class6;

public class Tut5Arrays {
    public static void main(String[] args) {
        // Array - used to store multiple values in a single variable;
        // When i assign array they all need to be same data type;
        // Example1:

        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";

        System.out.println(cars[3]);

        // Example2:

        String[] cars2 = new String[3];

        cars2[0] = "Mercedes";
        cars2[1] = "Toyota";
        cars2[2] = "Nissan";

        for(int i = 0; i<cars2.length; i++){
            System.out.println(cars2[i]);
        }
    }
}
