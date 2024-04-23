package com.codingTest.Baekjoon.Day10.q2;

import java.util.*;

public class Day10_02 {
    public static void printArray(int[] array){
        for (int i=0; i<3; i++)
            System.out.print(array[i]+"\t");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        int[] enter = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = (int) (Math.random() * 10 + 1);
        }
        printArray(num);

        for (int j = 0; j < 3; j++) {
            System.out.print("\n" + j + "번째 슷지 입력: ");
            enter[j] = sc.nextInt();
        }

        int sameButDifLoc = 0, sameLoc = 0;

        for (int k = 0; k < 3; k++)
            for (int l = 0; l < 3; l++) {
                if ((k == l) && (num[k] == enter[l]))
                    sameLoc++;
                else if ((k != l) && (num[k]) == enter[l])
                    sameButDifLoc++;
            }

        System.out.println("자리와 값이 모두 같은 숫자: "+sameLoc+"개");
        System.out.println("자리는 다르고 값이 같은 숫자:"+sameButDifLoc+"개");

        sc.close();

    }
}
