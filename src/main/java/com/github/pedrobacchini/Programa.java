package com.github.pedrobacchini;

import java.util.function.ToIntFunction;

public class Programa {

    public static void main(String[] args) {

        Long limit=1000000L;

        calcCollatz(limit, Collatz::cycle);

        calcCollatz(limit, CollatzOptimized::cycle);
    }

    private static void calcCollatz(Long limit, ToIntFunction<Long> collatzMethod) {
        int hicount = 0, hicountOwner = 0;

        long initialTime = System.currentTimeMillis();

        for(int i=1;i<=limit;i++){
            int cont = collatzMethod.applyAsInt((long) i);
            if(cont > hicount) {
                hicount = cont;
                hicountOwner = i;
            }
        }

        System.out.println(hicountOwner+" "+hicount+" "+limit);

        long finalTime = System.currentTimeMillis();
        System.out.println((finalTime-initialTime)/1000.0);
    }
}
