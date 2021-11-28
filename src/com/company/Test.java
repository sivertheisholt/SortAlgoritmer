package com.company;

public class Test {

    public int it1(int n) {
        System.out.println("Algoritme A");
        int sum=0;
        for(int i = 0; i < n; i+=2) {
            sum++;
            System.out.println("i="+i+": " + sum);
        }
        return sum;
    }

    public int it2(int n) {
        System.out.println("Algoritme B");
        int sum=0;
        for (int i=0; i<n; i++) {
            for (int j=-i; j<i; j++) {
                sum++;
                System.out.println("j="+j+": " + sum);
            }
            System.out.println("i="+i+": " + sum);
        }
        return sum;
    }
}
