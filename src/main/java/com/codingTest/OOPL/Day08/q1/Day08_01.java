package com.codingTest.OOPL.Day08.q1;

import java.util.*;

public class Day08_01 {
    public static void printInfo (Student sa, Student sb){
        if (sa.isTheSame(sb) == true)
            System.out.println("같은 객체입니다.");
        else
            System.out.println("다른 객체입니다.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student p1 = new Student("김동덕", 20132468, "컴퓨터학");
        Student p2 = new Student("홍길동", 20111234, "컴퓨터학");
        Student p3 = new Student("성춘향", 2012357, "컴퓨터학");
        Student p4 = p1;

        System.out.println("객체 p1의 정보");
        System.out.println(p1.printSafely());
        System.out.println("객체 p2의 정보");
        System.out.println(p2.printSafely());
        System.out.println("객체 p3의 정보");
        System.out.println(p3.printSafely());
        System.out.println("객체 p4의 정보");
        System.out.println(p4.printSafely());

        printInfo(p1, p2);
        printInfo(p2, p2);
        printInfo(p2, p3);
        printInfo(p1, p4);

        sc.close();

    }
}
