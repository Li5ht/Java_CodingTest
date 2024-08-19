package com.codingTest.OOPL.Day09.q2;

import com.codingTest.OOPL.Day09.q3.Date;

import java.util.Scanner;

public class Day09_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        com.codingTest.OOPL.Day09.q3.Date[] dateList = new com.codingTest.OOPL.Day09.q3.Date[5];

        for (int i = 0; i < 5; i++){
            System.out.println((i+1)+"번째 날짜를 입력하세요.");
            System.out.print("년: ");
            int y = sc.nextInt();
            System.out.print("월: ");
            int m = sc.nextInt();
            System.out.print("일: ");
            int d = sc.nextInt();
            dateList[i] = new com.codingTest.OOPL.Day09.q3.Date(y,m,d);
        }

        Date earliest = dateList[0];
        int count = 0;

/*
        for (int i = 1; i<5; i++){
            if (Date.compareDate(earliest.dateList[i])==-1){
                earliest = dateList[i];
                count += 1;
            }
        }

        System.out.println("가장 빠른 날짜는 "+count+"번째 입력된 "+earliest.toString()+"입니다.");
*/

        sc.close();
    }
}
