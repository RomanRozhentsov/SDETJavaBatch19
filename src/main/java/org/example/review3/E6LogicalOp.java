package org.example.review3;

public class E6LogicalOp {
    public static void main(String[] args) {
        // && Operator
        boolean degree = true;
        double bankBalance = 50000;
        boolean isTestPassed = true;

        if(degree && bankBalance>30000 && isTestPassed){
            System.out.println("We can get Admission in Master's");
        }
    }
}
