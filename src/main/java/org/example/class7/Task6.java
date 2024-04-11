package org.example.class7;

public class Task6 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 25;
        numbers[2] = 19;
        numbers[3] = 1;
        numbers[4] = 50;

        int lNum = 0;

        for(int num:numbers){

            if(lNum<num){
                lNum = num;
            }
        }
        System.out.println(lNum);
    }
}
