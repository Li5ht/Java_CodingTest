package com.codingTest.Baekjoon.Day10.q3;

import java.util.*;

public class Day10_03 {

    public static void printArray(int[] array){
        for (int i : array){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int sum = 0;

        for (int i=0; i<10; i++) {
            //10개의 0부터 100까지의 랜덤 난수 생성
            array[i] = (int) (Math.random() * 101);
            //총합 구하기
            sum += array[i];
        }
        //정방향
        printArray(array);

        //역순 출력
        for (int i=9; i>=0; i--){
            System.out.print(array[i]+"\t");
        }
        System.out.println();

        //난수들의 총합
        System.out.println("난수들의 총합: "+sum);
        //난수들의 평균
        System.out.println("난수들의 평균:"+(float)(sum/10));

        sc.close();

    }
}
