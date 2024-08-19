package com.codingTest.CodePlus.CodingTestBasic.Ch02;

import java.util.*;

public class CH02_02__PrimeNum__2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        long sum = 0;

        for (int i = 1; i<=num; i++){
            sum += i * (num/i);
        }

        System.out.println(sum);

        sc.close();
    }
}
