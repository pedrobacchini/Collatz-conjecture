package com.github.pedrobacchini;

public class collatz {

    private static Long cycle(Long n){
        Long cont = 1L;
        while(n!=1){
            if(n%2==0)
                n = n/2;
            else
                n = 3*n+1;
            cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();

        Long limit=1000000L;
        Long hicount = 0L, hicountOwner = 0L;

        for(Long i=1L;i<=limit;i++){
            Long cont = cycle(i);
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
