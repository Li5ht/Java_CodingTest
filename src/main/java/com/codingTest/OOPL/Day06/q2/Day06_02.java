package com.codingTest.OOPL.Day06.q2;

public class Day06_02 {
    public static void main(String[] args){
        Person p1 = new Person("김동덕", "서울시", 22);
        Person p2 = new Person("홍길동", "제주시", 30);
        Person p3 = new Person("성춘향", "남원시", 16);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
