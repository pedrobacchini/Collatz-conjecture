package com.github.pedrobacchini;

public class collatzOptimized {

    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();

        Long[] mem = new Long[1000001];

        long finalTime = System.currentTimeMillis();
        System.out.println((finalTime-initialTime)/1000.0);
    }
}
