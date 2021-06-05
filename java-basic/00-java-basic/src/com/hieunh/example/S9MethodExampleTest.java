package com.hieunh.example;

public class S9MethodExampleTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;

        int sumAB = S9MethodExample.sum(a, b);
        int subAB = S9MethodExample.sub(a, b);
        int mulAB = S9MethodExample.mul(a, b);

        System.out.println(sumAB);
        System.out.println(subAB);
        System.out.println(mulAB);
    }
}
