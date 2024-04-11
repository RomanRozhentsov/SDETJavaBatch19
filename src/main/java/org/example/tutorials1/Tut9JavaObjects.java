package org.example.tutorials1;

public class Tut9JavaObjects {
    public static void main(String[] args) {
        /*
        object - an instance of a class that may contain
        attributes and methods;
        example: (phone, desk, computer, coffee cup)
         */
        Tut8Car myCar = new Tut8Car();
        Tut8Car myCar2 = new Tut8Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        System.out.println();
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
        System.out.println();
        myCar.drive();
        myCar.brake();
    }
}
