package org.example.class6;

public class Tut2NestedLoops {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            System.out.println("It's so freaking cold outside!");
        }
        System.out.println("________________");

        String[] colors = {"Red", "Blue", "Green"};
        for(int i = 0; i<3; i++){
            System.out.println(colors[i]);
        }

        System.out.println("________________");

        String[][] fancyColors = { {"Red", "Blue", "Green"},
                                   {"Cyan", "Magenta", "Turquoise"}
        };
        for(int row = 0; row<2; row++){
            for(int column = 0; column<3; column++){
                System.out.println(fancyColors[row][column]);
            }
        }
        System.out.println("________________");

        for(int i = 0; i<5; i++){
            for(int j = 0; j<10; j++){
                System.out.println("i: "+i+", j: "+j);
            }
        }
    }
}
