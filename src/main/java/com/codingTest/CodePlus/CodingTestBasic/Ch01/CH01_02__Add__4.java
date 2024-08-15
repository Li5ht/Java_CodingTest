package com.codingTest.CodePlus.CodingTestBasic.Ch01;

import java.util.*;

public class CH01_02__Add__4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        while (sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();

            int sum = a + b;


            System.out.println(sum);
        }
        sc.close();
    }
}
