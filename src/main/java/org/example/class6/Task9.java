package org.example.class6;

public class Task9 {
    public static void main(String[] args) {

        int num = 100;

        do{
            System.out.println(num);
            if(num % 2 == 0){
                num = num -1;
                System.out.println(num);
            }
            num = num-2;
        }while(num>=1);
    }
}
