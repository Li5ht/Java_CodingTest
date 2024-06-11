package com.codingTest.OOPL.Day07.q1;

import java.util.*;

public class Day07_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BodyData me = new BodyData();
        BodyData you = new BodyData();

        System.out.print("내 키를 입력하세요: ");
        me.setHeight(sc.nextInt());
        System.out.print("내 몸무게를 입력하세요: ");
        me.setWeight(sc.nextInt());

        System.out.print("당신의 키를 입력하세요: ");
        you.setHeight(sc.nextInt());
        System.out.print("당신의 키를 입력하세요: ");
        you.setWeight(sc.nextInt());

        if (me.isTallerThan(you))
            System.out.println("키는 내가 더 큽니다.");
        else
            System.out.println("나와 당신의 키는 같습니다");

        if (me.needDiet())
            System.out.println("나는 다이어트가 필요합니다.");
        else
            System.out.println("나는 다이어트가 필요하지 않습니다.");

        if (you.needDiet())
            System.out.println("당신은 다이어트가 필요합니다.");
        else
            System.out.println("당신은 다이어트가 필요하지 않습니다.");

        sc.close();

    }
}
