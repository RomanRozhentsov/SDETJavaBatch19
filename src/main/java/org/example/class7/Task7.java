package org.example.class7;

public class Task7 {
    public static void main(String[] args) {

        char[] symbols = new char[5];

        symbols[0] = 'A';
        symbols[1] = '!';
        symbols[2] = '#';
        symbols[3] = '3';
        symbols[4] = 'b';
        // reverse loop;

        int i = symbols.length-1;
        while(i>=0){
            System.out.println(symbols[i]);
            i--;
        }

    }
}
