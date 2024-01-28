package com.codingTest.PCCP.Lesson.LAB2;

public class LAB2_2 {
    public boolean solution(int[] arr) {

        int[] chk = new int[arr.length];

        for(int i : arr) {
            if(i>arr.length) return false;
            else chk[i-1]++;

            if(chk[i-1] > 1) return false;
        }

        for(int i : chk) {
            if(i == 0) return false;
        }

        return true;
    }
}
