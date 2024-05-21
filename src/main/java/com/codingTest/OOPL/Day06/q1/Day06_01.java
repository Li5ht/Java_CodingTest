package com.codingTest.OOPL.Day06.q1;

public class Day06_01 {
    public static void main(String[] args){
        Date d1 = new Date(2010,8,31);
        Date d2 = new Date(1998,9,15);

        System.out.println(d1.toString());
        System.out.println(d1.printWestern());

        System.out.println(d2.toString());
        System.out.println(d2.printWestern());
    }
}
