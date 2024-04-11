package org.example.review3;

public class E10Loops {
    public static void main(String[] args) {

        /*I need to print these numbers:
        10, 20, 40, 50;
         */

        int num = 10;

        while(num<=50){
            if(num==20){
                System.out.println(num);
                num = num+20;
            }else if(num==40){
                num = num+10;
                System.out.println(num);
            }
            System.out.println(num);
            num = num+10;

            }
        }
    }
