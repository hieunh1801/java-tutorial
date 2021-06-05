package com.hieunh.inheritanceexample;

public class InheritanceExampleTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        boolean catIsAnimal = cat instanceof Animal;
        boolean catIsCat = cat instanceof Cat;
        cat.say();
        cat.move();

        Animal cat2 = new Cat();
        cat2.move();
        cat2.say();
    }
}
