package com.codingTest.OOPL.Day03.q1;

import java.util.*;

public class Day03_01 {
    public static int searchArray(int[] array, int key){
        for (int i=0; i<5; i++){
            if (key == array[i]){
                return 1;
            }
        }
        return -1;
    }

    public static void printArray(int[] array){
        for (int i=0; i<5; i++)
            System.out.print(array[i]+"\t");
        System.out.println();
    }
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int ct = 1;

        do {
            System.out.println("("+ct+"차 실행)");
            for (int i = 0; i < 5; i++) {
                num[i] = (int) (Math.random() * 101);
            }
            printArray(num);
            ct++;
        } while (searchArray(num, 100) == 1);

        System.out.println(ct+"차 실행에서 난수 100이 발생했으므로 프로그램을 종료합니다.");

    }
}
