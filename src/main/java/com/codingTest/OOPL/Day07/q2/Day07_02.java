package com.codingTest.OOPL.Day07.q2;

import java.util.*;

public class Day07_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Square s1 = new Square();
        Square s2 = new Square();

        System.out.print("사각형1의 가로를 입력");
        s1.setWidth(sc.nextInt());
        System.out.print("사각형1의 세로를 입력");
        s1.setHeight(sc.nextInt());
        System.out.print("사각형2의 가로를 입력");
        s2.setWidth(sc.nextInt());
        System.out.print("사각형2의 가로를 입력");
        s2.setHeight(sc.nextInt());

        if (s1.isSmallerThan(s2) == true)
            System.out.println("사각형1의 넓이가 더 작습니다.");

        else
            System.out.println("사각형1의 넓이가 더 작습니다.");


        sc.close();

    }
}