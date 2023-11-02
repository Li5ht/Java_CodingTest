package com.codingTest.Baekjoon.Day05.q1;

import java.util.Scanner;

public class Day05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //방법1
       /* int num = sc.nextInt();
        int count = 0;

        if (num % 4 == 0){
            count = num / 4;
                for (int i = 0; i < count; i++) {
                    System.out.print("long ");
                }
        }
        System.out.println("int");*/

        //방법2
        int n = sc.nextInt();
        String str = "";
        sc.close();

        for(int i=1; i<=n/4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");

        sc.close();
    }
}
