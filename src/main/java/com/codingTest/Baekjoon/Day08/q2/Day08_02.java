package com.codingTest.Baekjoon.Day08.q2;

import java.util.*;

public class Day08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        int max = 0, min = 0;

        for (int i = 0; i < n ; i++){
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n ; i++){
            if (A[i] < max ) {
                max = A[i];
            }
            if (A[i] > min ) {
                min = A[i];
            }
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}
