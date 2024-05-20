package com.codingTest.OOPL.Day05.q2;

import com.codingTest.OOPL.Day05.q2.Date;

public class Day05_02 {
    public static void main(String[] args){
        Date d1 = new Date(2007, 2, 18);
        Date d2 = new Date(2006, 3, 2);
        Date d3 = new Date(2007, 2, 27);
        Date d4 = new Date(2007, 3, 2);
        Date d5 = new Date(2007, 4, 20);
        Date d6 = new Date(2007, 4, 26);

        System.out.println("오늘은"+d1+"입니다.");
        System.out.println("내가 동덕여자대학교에 입학한 날짜는"+d2+"입니다");
        System.out.println("2007학년도 개강일은 "+d3+"에서 "+d4+"로 변경되었습니다.");
        System.out.println("중간고사 기간은 "+d5+"에서 "+d6+"까지 입니다.");

    }
}
