package com.codingTest.OOPL.Day08.q2;

public class Day08_02 {
    public static void main(String[] args){
        Date d1 = new Date(2007,2,18);
        Date d2 = new Date(2007,3,2);
        Date d3 = new Date(2007,2,27);
        Date d4 = new Date(2007,3,2);
        Date d5 = new Date(2007,4,20);
        Date d6 = new Date(2007,4,26);

        System.out.println("오늘은 "+ d1.toStirng()+"입니다.");
        System.out.println("내가 동덕여자대학교에 입학 날짜는 "+d2.toStirng()+"입니다.");
        System.out.println("2007학년도 개강일은 "+d3.toString()+"에서 "+d4.toStirng()+"일짜로 변경되었습니다");
        System.out.println("중간고사 기간은 "+d5.toStirng() + "에서 "+d6.toStirng()+"까지 입니다.");
    }
}
