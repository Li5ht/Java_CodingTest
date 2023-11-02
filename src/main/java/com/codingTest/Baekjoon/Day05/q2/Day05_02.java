package com.codingTest.Baekjoon.Day05.q2;

// import java.util.Scanner; -> 이번 문제에서눈 BufferedReader를 사용하여 적을 것
//mport java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.IOException;
import java.io.*;
import java.util.StringTokenizer;

//BuffredReader/Writer 쓰기

public class Day05_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //int n = Integer.parseInt(rd.readLine());

        /*int[] A = new int[n];
        int[] B = new int[n];
        int[] sum =new int[n];

        for (int i = 0; i < n; i++){
            A[i] = Integer.parseInt(rd.readLine());
            B[i] = Integer.parseInt(rd.readLine());
            sum[i] = A[i] + B[i];
        }

        for (int j = 0; j < n; j++){
            bw.write(sum[j]+'\n');
        }*/

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }
        br.close();
        bw.flush();
        bw.close();


        //sc.close();
    }
}
