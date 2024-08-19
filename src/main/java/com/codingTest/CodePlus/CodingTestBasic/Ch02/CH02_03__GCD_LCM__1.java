package com.codingTest.CodePlus.CodingTestBasic.Ch02;

import java.util.*;

public class CH02_03__GCD_LCM__1 {

    public int gcd(int a, int b){
        while (b != 0 ) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int lcm(int a, int b){
        if  (b == 0 )
            return a;
        return gcd (b, a%b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = gcd(a,b);

        System.out.println(d);
        System.out.println(a * b /d);

        sc.close();

    }
}
