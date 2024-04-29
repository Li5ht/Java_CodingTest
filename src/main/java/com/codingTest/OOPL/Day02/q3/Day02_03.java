package com.codingTest.OOPL.Day02.q3;

import java.util.*;

public class Day02_03 {
    public static int searchArray(int[] array, int key){
        int ct = 0;
        for (int i=0; i<10; i++){
            if (key == array[i]){
                if (ct > 1)
                    return 0;
                else if (ct == 0 ){
                    ct++;
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void printArray(int[] array){
        System.out.println("배열에 저장된 난수값 출력: ");
        for (int i=0; i<10; i++)
            System.out.print(array[i]+"\t");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
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
