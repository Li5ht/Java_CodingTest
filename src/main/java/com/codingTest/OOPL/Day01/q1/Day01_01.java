package com.codingTest.OOPL.Day01.q1;

import java.util.Scanner;

public class Day01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("철수 입력: ");
        String c = sc.nextLine();

        if (!(c.equals("가위")) && !(c.equals("바위")) && !(c.equals("보")) ){
            System.out.println("잘못된 입력입니다.'가위, 바위, 보' 중에서 입력해주세요!");
            System.out.print("철수 입력: ");
            c = sc.nextLine();
        }

        System.out.print("영희 입력: ");
        String y = sc.nextLine();

        if (!(y.equals("가위")) && !(y.equals("바위")) && !(y.equals("보")) ){
            System.out.println("잘못된 입력입니다.'가위, 바위, 보' 중에서 입력해주세요!");
            System.out.print("영희 입력: ");
            y = sc.nextLine();
        }

        if (c.equals("가위")){
            if (y.equals("가위"))
                System.out.println("비겼습니다.");
            else if (y.equals("바위"))
                System.out.println("영희가 이겼습니다.");
            else if (y.equals("보"))
                System.out.println("철수가 이겼습니다.");
        }
        else if (c.equals("바위")){
            if (y.equals("가위"))
                System.out.println("철수가 이겼습니다.");
            else if (y.equals("바위"))
                System.out.println("비겼습니다.");
            else if (y.equals("보"))
                System.out.println("영희가 이겼습니다.");
        }
        else if (c.equals("보")){
            if (y.equals("가위"))
                System.out.println("영희가 이겼습니다.");
            else if (y.equals("바위"))
                System.out.println("철수가 이겼습니다.");
            else if (y.equals("보"))
                System.out.println("비겼습니다.");
        }

        sc.close();

    }
}
