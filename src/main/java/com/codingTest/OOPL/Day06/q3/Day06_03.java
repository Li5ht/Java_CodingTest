package com.codingTest.OOPL.Day06.q3;
public class Day06_03 {
    public static void main(String[] args){
        Student p1 = new Student("김동덕", 22, "서울시", 2013468, "컴푸터학");
        Student p2 = new Student ("홍길동", 30, "제주시",20111234,"컴퓨터학");
        Student p3 = new Student("성춘향", 16, "남원시", 20121357,"국문학");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println(p1.printSafely());
        System.out.println(p2.printSafely());
        System.out.println(p3.printSafely());
    }
}
