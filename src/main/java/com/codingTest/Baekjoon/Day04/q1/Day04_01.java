package com.codingTest.Baekjoon.Day04.q1;

import java.util.Scanner;

public class Day04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int cooking = sc.nextInt();
        int cookMin = m + cooking;

        if (cookMin >= 60){
            cooking = cookMin / 60;
            h = h + cooking;
            m = cookMin % 60;
        }
        else{
            m = cookMin;
        }

        if (h >= 24){
            h = h % 24;
        }

        System.out.println(h + " " + m);


        sc.close();
    }
}
