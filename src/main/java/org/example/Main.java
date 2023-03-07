package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fruit apple = new Fruit("Red","sweet");
        Fruit lime = new Fruit("Yellow","sour");

        System.out.println("Is apple tasty? "+apple.isTasty());
        System.out.println("Is lime tasty? "+lime.isTasty());

        Fruit appleCopy = Fruit.copy(apple);
        System.out.println("Done");
    }
}