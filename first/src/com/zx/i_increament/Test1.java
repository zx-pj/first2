package com.zx.i_increament;

public class Test1 {
    public static void main(String[] args) {
        int i = 2;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
