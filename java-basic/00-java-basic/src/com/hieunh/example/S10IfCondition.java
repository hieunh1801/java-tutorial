package com.hieunh.example;

public class S10IfCondition {
    public static void main(String[] args) {
        System.out.println("IF ELSE STATEMENT");

        int age = 10;

        if (age < 10) {
            System.out.println("Kid");
        } else if (age >= 10 && age < 20) {
            System.out.println("Young");
        } else if (age >= 20) {
            System.out.println("Old");
        }

    }
}
