package org.example.class4;

public class Task7 {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 15;
        int num3 = 17;

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1);
            }else{
                System.out.println(num3);
            }
        }else{
            if(num2>num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        }
    }
}
