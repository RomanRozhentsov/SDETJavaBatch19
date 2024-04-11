package org.example.class3;

public class IfElseIf3 {
    public static void main(String[] args) {

        int age=16;
        String blubSize;

        if(age<=3){
            blubSize = "Small Blub";
        }
        else if (age > 3 && age < 15){
            blubSize = "Medium Blub";
        }
        else{
            blubSize = "Big Boy Blub";
        }
        System.out.println(blubSize);
    }
}
