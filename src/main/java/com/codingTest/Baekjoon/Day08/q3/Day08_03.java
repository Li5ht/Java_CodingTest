package com.codingTest.Baekjoon.Day08.q3;

import java.util.*;

public class Day08_03 {

    public static int whoswin(String com, String me){
        if ((com.equals("가위")&& me.equals("가위")) || (com.equals("바위") && me.equals("바위")) || (com.equals("보") && me.equals("보")))
            return 0;
        else if ((com.equals("가위")&& me.equals("보")) || (com.equals("바위") && me.equals("가위")) || (com.equals("보") && me.equals("주먹")))
            return -1;
        else if ((com.equals("가위")&& me.equals("바위")) || (com.equals("바위") && me.equals("보")) || (com.equals("보") && me.equals("가위")))
            return 1;
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int computer = (int)(Math.random()*3);
        String com = "";

        switch(computer){
            case 1 : com = "가위"; break;
            case 2 : com = "바위"; break;
            case 3 : com = "보"; break;
        }

        System.out.print("당신의 입력: ");
        String me = sc.nextLine();
        if (!(me.equals("가위")) && !(me.equals("바위")) && !(me.equals("보")) ){
            System.out.println("잘못된 입력입니다.'가위, 바위, 보' 중에서 입력해주세요!");
            System.out.print("영희 입력: ");
            me = sc.nextLine();
        }

        if (whoswin(com, me) == -1)
            System.out.println("컴퓨터가 이겼습니다.");
        else if (whoswin(com, me) == 0)
            System.out.println("비겼습니다.");
        else if (whoswin(com, me) == 1)
            System.out.println("당신이 이겼습니다.");

        sc.close();
    }
}