package org.example.class7;

public class Task5_1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 20;
        numbers[1] = 14;
        numbers[2] = 11;
        numbers[3] = 10;
        numbers[4] = 17;

        int i = 0;
        while(i<5){
            i++;
            if(i==4){
                int a = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
                System.out.println(a);
            }
        }



    }
}
