package org.example.tutorials1;

public class Tut5Class1 {
    public static void main(String[] args) {
        Tut4Class1 c = new Tut4Class1();
        Tut4Class1 d = new Tut4Class1();
        System.out.println(c.x);
        System.out.println(d.x);
        // One class can do multiple objects;
        c.printHi();
    }
}
