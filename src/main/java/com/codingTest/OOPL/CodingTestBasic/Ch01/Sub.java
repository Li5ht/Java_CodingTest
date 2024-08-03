package com.codingTest.OOPL.CodingTestBasic.Ch01;

import java.io.*;

public class Sub {
    public static void main (String[ ] args)  throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        System.out.println(a+b);

        bf.close();
    }
}
