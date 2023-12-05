package com.codingTest.PCCP.Q1;

import java.util.*;

//따로 다시 해볼 것
public class Q1 {

    private static class Point {
        //좌표를 나타내는 클래스
        public final long x, y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;

        }
    }

    private Point instersections(long a1, long b1, long c1, long a2, long b2, long c2){
        //두 직선의 교점 다음과 같이 계산됨 (이미 조건에 나와있음)
        // x = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        // y = (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0 ) return null;

        return new Point((long)x, (long)y);
    }

    private Point getMinPoint(List<Point> points) {
        //x, y 좌표의 최소값 구하는 메서드
        // 가장 작은 좌표 찾기
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x ) x = p.x;
            if (p.y > y ) y = p.y;
        }
        return new Point(x,y);
    }

    private Point getMaxPoint(List<Point> points) {
        //x, y 좌표의 최대값 구하는 메서드
        // 가장 큰 좌표 찾기
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x ) x = p.x;
            if (p.y < y ) y = p.y;
        }
        return new Point(x,y);
    }

    public String[] solution(int[][] line) {
        //정수 좌표 지정
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = instersections(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if (intersection != null)
                    points.add(intersection);
            }
        }

        //배열 크기 구하기
        Point min = getMinPoint(points);
        Point max = getMaxPoint(points);

        int width = (int) (max.x - min.x + 1);
        int height = (int) (max.y - min.y + 1);

        //높이 성분 명시
        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        //2차원 배열에 별 표시
        for (Point p : points) {
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);
            arr[y][x] = '*';
        }

        //문자열 배열로 반환 후 반환
        String[] result = new String[arr.length];
        for (int i = 0; i <result.length; i++) {
            result[i] = new String(arr[i]);
        }

        return result;
    }
}



