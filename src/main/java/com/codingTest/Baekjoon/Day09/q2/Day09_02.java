package com.codingTest.Baekjoon.Day09.q2;

public class Day09_02 {
    public static void main(String[] args){
        int[] num = new int[10];
        int sum = 0;
        float ave = 0;

        for (int i=0; i<10; i++){
            num[i] = (int)(Math.random()*101);
            System.out.print(num[i]+"\t");
            sum += num[i];
        }

        ave = (float)sum / 10;
        System.out.println();

        for (int j=9; j>=0; j--)
            System.out.print(num[j] + "\t");

        System.out.println("\n난수들의 총합:"+sum);
        System.out.println("난수들의 평균:"+ave);
    }
}
