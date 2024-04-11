package org.example.myProjects;

import java.util.Scanner;

public class E1Fullbody {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Фуллбади или сплит?");
        String choice = scan.next();

        if(choice.equalsIgnoreCase("Фуллбади")){
            System.out.println("Молодец перчик, значит фуллбади");
        }
        else if(choice.equalsIgnoreCase("Сплит")){
            System.out.println("Так держать кабанчик ты выбрал сплит");
        }
        else{
            System.out.println("Самый верный вариант невыбрать ничего, соответственно дота!");
        }
    }
}
