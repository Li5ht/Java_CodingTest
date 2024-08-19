package com.codingTest.CodePlus.CodingTestBasic.Ch02;

import java.util.*;

public class CH02_02__PrimeNum__1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (n-- > 0){
            int e = sc.nextInt();
            max = e > max ? e : max;
            min = e < min ? e : min;
        }

        System.out.println(max * min);


        sc.close();
    }
}
