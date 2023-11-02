package com.codingTest.Baekjoon.Day01.q3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Day01_03 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //방법 1
        int x = sc.nextInt();
        String y = sc.next();

        System.out.println(x * (y.charAt(2) - '0'));
        System.out.println(x * (y.charAt(1) - '0'));
        System.out.println(x * (y.charAt(0) - '0'));
        System.out.println(x * Integer.parseInt(y));

        //방법 2
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * (b % 10 / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);

        //방법 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        char[] t = B.toCharArray();


        System.out.println(A * (t[2]-'0'));
        System.out.println(A * (t[1]-'0'));
        System.out.println(A * (t[0]-'0'));
        System.out.println(A * Integer.parseInt(B));

        //방법 4 + 보너스

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        int A2 = Integer.parseInt(br.readLine());
        int B2 = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A2 * (B2%10));
        sb.append('\n');

        sb.append(A2 * ((B2%100)/10));
        sb.append('\n');

        sb.append(A2 * (B2/100));
        sb.append('\n');

        sb.append(A2 * B2);

        System.out.print(sb);

        sc.close();
    }
}
