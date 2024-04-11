package org.example.review3;

public class Tut4Arrays {
    public static void main(String[] args) {

        System.out.println("Welcome to our Zombie keller program!");

        String[] backpack = new String[3];

        backpack[0] = "Shotgun";
        backpack[1] = "Assault Rifle";
        backpack[2] = "Sniper";

        String[] zombies = new String[3];

        zombies[0] = "Close-range Zombie";
        zombies[1] = "Mid-range Zombie";
        zombies[2] = "Long-Range Zombie";

        System.out.println("Backpack Items:");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);
        System.out.println("These are the Zombies:");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);

    }
}
