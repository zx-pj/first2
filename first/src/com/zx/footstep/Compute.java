package com.zx.footstep;

public class Compute {
    public static void main(String[] args) {
        Compute compute = new Compute();
        long start = System.currentTimeMillis();
        long result = compute.compute(5);
        long end = System.currentTimeMillis();
        System.out.println(result+"====="+(end-start)/1000);
    }

    public long compute(long i) {
        if (i == 2||i==1){
            return i;
        }
        return compute(i-1)+compute(i-2);
    }
}


