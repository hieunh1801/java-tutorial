package com.hieunh.example;

public class S9StaticExampleTest {
    public static void main(String[] args) {
        System.out.println(S9StaticExample.MY_STATIC_FIELD);
        System.out.println(S9StaticExample.MY_FINAL_STATIC_FIELD);

        S9StaticExample.MY_STATIC_FIELD = 123;
        System.out.println(S9StaticExample.MY_STATIC_FIELD);

    }
}
