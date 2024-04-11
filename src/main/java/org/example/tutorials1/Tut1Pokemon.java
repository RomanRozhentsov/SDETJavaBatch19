package org.example.tutorials1;

public class Tut1Pokemon {

    String name;
    int level;

    Tut1Pokemon(){
        level = 1;
    }

    Tut1Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        //this.attack();
    }
    // Method:
    void attack(){
        System.out.println(name+" attack!");
    }
}
