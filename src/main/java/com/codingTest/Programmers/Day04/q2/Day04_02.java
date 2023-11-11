package com.codingTest.Programmers.Day04.q2;

public class Day04_02 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i<k; i++){
            answer+=my_string;
        }
        return answer;
    }
}
