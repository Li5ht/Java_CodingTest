package com.codingTest.OOPL.Day09.q1;

import com.codingTest.OOPL.Day06.q1.Date;

import java.util.*;

public class Day09_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Date[] dateList = new Date[5];

        for (int i = 0; i < 5; i++){
            System.out.println((i+1)+"번째 날짜를 입력하세요.");
            System.out.print("년도:");
            dateList[i].setYear(sc.nextInt());
            System.out.print("월:");
            dateList[i].setMonth(sc.nextInt());
            System.out.print("일:");
            dateList[i].setDay(sc.nextInt());
        }

       /* for (int j = 0; j < 5; j++){
            System.out.println((j+1)+"번째 날짜는 "+dateList[j].getMonth()+"년 "+dateList[j].getMonth()+"월 "+
                    dateList[j].getDay()+"일입니다.");
        }*/

        for (int j = 0; j < 5; j++){
            System.out.println((j+1)+"번째 날짜는 "+dateList[j].toString()+"일입니다.");

        sc.close();


      /*  com.codingTest.OOPL.Day06.q1.Date d1 = new com.codingTest.OOPL.Day06.q1.Date(2010,8,31);
        com.codingTest.OOPL.Day06.q1.Date d2 = new Date(1998,9,15);

        System.out.println(d1.toString());
        System.out.println(d1.printWestern());

        System.out.println(d2.toString());
        System.out.println(d2.printWestern());*/
    }
}
