package org.example.review1;

public class E5ArithmeticOp {
    public static void main(String[] args) {
        int num1=10;
        int num2=3;
        int result=num1/num2;
        int remainder=num1%num2;
        System.out.println(result);
        System.out.println(remainder);
        // if you divide something equally remainder shows you what left.
        System.out.println(10+"10"+10);
        // from left to right - int 10 + Str 10 (concatenation) + int 10 (concatenation) = 101010
        System.out.println(10+10+"10");
        // from left to right - int 10 + int 10 (addition = 20) + Str 10 (concatenation) = 2010

    }
}
