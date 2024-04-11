package org.example.class3;

public class TemperaturteCheck {
    public static void main(String[] args) {
        int temp = 17;
        if(temp<32){
            System.out.println("Water will freeze with temperature "+temp+".");
        }
        else{
            System.out.println("Water will NOT freeze with temperature "+temp+".");
        }
    }
}
