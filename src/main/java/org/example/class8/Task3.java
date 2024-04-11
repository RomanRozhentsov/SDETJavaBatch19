package org.example.class8;

public class Task3 {
    public static void main(String[] args) {

        String[][] matrix = {
                {"Roman", "Alex", "Andrew", "Gregory"},
                {"A", "C", "B", "D"}
        };

        for(int i = 0; i<2; i++){
            for(int j = 0; j<4; j++){
                if(matrix[i][j].equalsIgnoreCase("A")){
                    System.out.println(matrix[i-1][j]+" has grade - A");
                }else if(matrix[i][j].equalsIgnoreCase("B")){
                    System.out.println(matrix[i-1][j]+" has grade - B");
                }
            }
        }
    }
}
