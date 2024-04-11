package org.example.review3;

public class E4LogicalOp {
    public static void main(String[] args) {
        // Logical operators only work with boolean data types;
        System.out.println(!false);
        System.out.println(!true);

        boolean cond = true;
        System.out.println(!cond);

        int age = 10;
        System.out.println(!(age>5));
    }
}
