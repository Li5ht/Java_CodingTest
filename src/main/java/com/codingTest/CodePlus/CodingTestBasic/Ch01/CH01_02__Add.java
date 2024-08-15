package com.codingTest.CodePlus.CodingTestBasic.Ch01;

import java.io.*;

//import java.util.*;

public class CH01_02__Add {
    public static void main(String[] args) throws IOException{
        //BufferedReader 사용 -> readLine 사용하려면 throws IOExeption 필요함
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        System.out.println(a+b);


        bf.close();

        // 원래 사용하던 방법 : Scanner 이용
        /*Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);

        sc.close();*/
    }
}
