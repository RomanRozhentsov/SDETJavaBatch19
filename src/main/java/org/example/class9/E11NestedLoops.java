package org.example.class9;

public class E11NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
