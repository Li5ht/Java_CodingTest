package com.codingTest.Baekjoon.Day11.q1;

import java.util.Scanner;

public class Day11_01 {
    public static int searchArray(int[] array, int key){
        int count = 0, location = 1;
        for (int i : array){
            if (key == i){
                location++;
                if (count>1)
                    return 0;
                else if (count==0)
                    return location;
            }
        }
        return -1;
    }

    public static void printArray(int[] array){
        System.out.println("배열에 저장된 난수값 출력: ");
        for (int i : array)
            System.out.print(array[i]+"\t");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i : num ) {
            num[i] = (int) (Math.random() * 100);
        }
        printArray(num);

        System.out.print("착고 싶은 숫자를 입력하세요:");
        int key = sc.nextInt();
        if (searchArray(num, key) > 10)
            System.out.println("입력된 숫자 " + key + "는 배열의 " + searchArray(num, key) + "번째 자리가 있습니다.");
        else
            System.out.println("입력된 숫자 " + key + "는 배열에 없습니다.");

        sc.close();
    }
}
