package com.codingTest.Baekjoon.Day05.q3;

import java.util.Scanner;

public class Day05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] sum = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum[i] = a[i] + b[i];
        }

        for (int i=0; i<n; i++){
            System.out.println("Case "+(i+1)+": "+sum[i]);
        }*/

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            int c = in.nextInt();
            int d = in.nextInt();

            System.out.println("Case #" + i + ": " + (c + d));
        }

        sc.close();
    }
}
