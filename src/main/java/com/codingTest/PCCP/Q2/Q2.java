package com.codingTest.PCCP.Q2;

import com.codingTest.PCCP.Q1.Q1;

public class Q2 {
    private static class Point{
        public final long x, y;

        private Point(long x, long y){
            this.y = y;
            this.x = x;
        }
    }

    private Q1.Point intersection(long a1, long b1, long c1, long a2, long b2, long c2){
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - b2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - b2 * b1);

        if (x % 1 != 0 || y % 1 != 0)
            return null;

        return new Q1.Point((long)x, (long)y);
    }
}
