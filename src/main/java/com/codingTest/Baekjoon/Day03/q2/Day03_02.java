package com.codingTest.Baekjoon.Day03.q2;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Day03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        /*
        //이 코드도 잘 돌아감 - 방법 1
        if (x>0 && y>0)
            System.out.println("1");
        else if (x<0 && y>0)
            System.out.println("2");
        else if (x<0 && y<0)
            System.out.println("3");
        else if (x>0 && y<0)
            System.out.println("4");
         */

        //좀 더 깔끔한 버전으로 작성 - 방법 2
       if (x > 0) {
            if (y > 0) {
                System.out.print("1");
            }
            else {
                System.out.print("4");
            }
        }
        else {
            if (y > 0) {
                System.out.print("2");
            }
            else {
                System.out.print("3");
            }
        }

        sc.close();

        /*
        //BufferedReader를 사용하여 작성 - 방법 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        if(X > 0) {
            if(Y > 0) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        }

        else {
            if(Y > 0) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }*/
    }
}
