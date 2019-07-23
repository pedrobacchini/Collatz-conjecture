package com.github.pedrobacchini;

class CollatzOptimized {

    private static int[] mem = new int[1000001];

    static int cycle(long n) {
        int t = 1;
        long temp = n;

        while(n != 1) {
            if(n % 2 == 0) n = n / 2;
            else n = 3 * n + 1;
            if(n <= 1000000 && mem[(int)n] != 0) {
                if(temp <= 1000000) {
                    mem[(int)temp] = mem[(int)n] + t;
                    return mem[(int)temp];
                } else {
                    return mem[(int)n] + t;
                }
            }
            t++;
        }

        if(temp <= 1000000) mem[(int)temp] = t;
        return t;
    }
}
