package com.codingTest.OOPL.Day01.q2;

import java.util.*;

public class Day01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*MATH 사용하여 랜덤을 생성하는 법도 잊지말자!*/
        int com = (int)(Math.random()*3);

        if (com == 0)
            System.out.println("가위");
        else if (com == 1)
            System.out.println("바위");
        else
            System.out.println("보");

        System.out.print("당신의 입력: ");
        String me = sc.nextLine();
        if (!(me.equals("가위")) && !(me.equals("바위")) && !(me.equals("보")) ){
            System.out.println("잘못된 입력입니다.'가위, 바위, 보' 중에서 입력해주세요!");
            System.out.print("영희 입력: ");
            me = sc.nextLine();
        }

        if  (com == 0){
            if (me.equals("가위"))
                System.out.println("당신이 이겼습니다.");
            else if (me.equals("바위"))
                System.out.println("컴퓨터가 이겼습니다.");
            else if (me.equals("보"))
                System.out.println("컴퓨터가 이겼습니다.");
        }
        else  if (com == 1){
            if (me.equals("가위"))
                System.out.println("컴퓨터가 이겼습니다.");
            else if (me.equals("바위"))
                System.out.println("비겼습니다.");
            else if (me.equals("보"))
                System.out.println("당신이 이겼습니다.");
        }
        else {
            if (me.equals("가위"))
                System.out.println("비겼습니다.");
            else if (me.equals("바위"))
                System.out.println("컴퓨터가 이겼습니다.");
            else if (me.equals("보"))
                System.out.println("당신이 이겼습니다.");
        }

        sc.close();

    }
}
