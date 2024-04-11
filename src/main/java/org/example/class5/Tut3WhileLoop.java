package org.example.class5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tut3WhileLoop {
    public static void main(String[] args) {

        String sentence = "Flapjacks are awesome!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String>words = new ArrayList<String>();

        while(scan.hasNext()){
            words.add(scan.next());
        }
        System.out.println(words);

    }
}
