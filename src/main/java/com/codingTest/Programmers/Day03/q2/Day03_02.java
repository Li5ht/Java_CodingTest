package com.codingTest.Programmers.Day03.q2;

public class Day03_02 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }

}
