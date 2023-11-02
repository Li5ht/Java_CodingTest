package com.codingTest.Baekjoon.Day07.q3;

import java.util.Scanner;

public class Day07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();// 갯수 입력

        int[] numOfArray = new int[n];

        for (int i = 0 ; i < n; i++){
            numOfArray[i] = sc.nextInt();
        }

        int find = sc.nextInt();
        int count = 0;
        for (int i =0; i<n; i++){
            if (numOfArray[i]==find){
                count++;
            }
        }

        System.out.println(count);

        sc.close();

    }
}
