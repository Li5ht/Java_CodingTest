package com.codingTest.PCCP.Q1;

import java.util.*;

public class Q1 {

    private static class Point {
        public final long x, y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;

        }
    }

    private Point instersection(long a1, long b1, long c1, long a2, long b2, long c2){
        //두 직선의 교점 다음과 같이 계산됨
        // x = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        // y = (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0 ) return null;

        return new Point((long)x, (long)y);
    }

    public String[] solution(int[][] line) {
        String[] answer = {};

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                System.out.println();
            }
        }
        return answer;
    }












    }
}



