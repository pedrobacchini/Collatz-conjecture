package com.github.pedrobacchini;

class Collatz {

    static int cycle(Long n){
        int cont = 1;
        while(n!=1){
            if(n%2==0) n = n/2;
            else n = 3*n+1;
            cont++;
        }
        return cont;
    }
}
