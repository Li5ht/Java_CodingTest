package com.codingTest.CodePlus.CodingTestBasic.Ch01;

//백준문제 : https://www.acmicpc.net/problem/10950

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
*/

import java.io.*;
import java.util.*;

public class Add_3 {

    //백준에서는 Exception & IO 때문에 런타임 에러남...ㅋㅋㅋ -> 즉 사용하지 말라는 소리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //라인 수 입출력
        int n = Integer.parseInt(br.readLine());

        //StringTokenizer 클래스느 자바에서 제공하는 클래스로 특정 문자열을 구분자를 지정해 무리할 때 사용하는 클래스이다.
        StringTokenizer st;
        int a, b;
        for (int i =  0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());

            System.out.println(a+b);
        }

        //완전 틀린건 아니니 주석처리
        /*int[] sum = new int[5];

        for (int i = 0; i < n; i++){
            //a+b 입력받기
            int a = Integer.parseInt(bf.readLine());
            int b = Integer.parseInt(bf.readLine());
            sum[i] = a + b;
        }

        for (int i = 0; i < n; i++){
            System.out.println(sum[i]);
        }
*/
        br.close();

    }

}
