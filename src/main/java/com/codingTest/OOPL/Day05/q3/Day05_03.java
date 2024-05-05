package com.codingTest.OOPL.Day05.q3;

import com.codingTest.OOPL.Day05.q1.Date;

public class Day05_03 {
    public static void main(String[] args){
        com.codingTest.OOPL.Day05.q1.Date d1 = new com.codingTest.OOPL.Day05.q1.Date();
        com.codingTest.OOPL.Day05.q1.Date d2 = new Date();

        d1.setYear(2010);
        d1.setMonth(8);
        d1.setDay(31);
        System.out.println(d1.toString());

        d2.setYear(1998);
        d2.setMonth(9);
        d2.setDay(15);
        System.out.println(d2.toString());
    }
}
