package com.codingTest.Programmers.Day05.q1;

public class Day05_01 {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        int len01 = overwrite_string.length();
        int len02 = my_string.length();
        String sub01 = my_string.substring(0, s);
        String sub02 = my_string.substring((s+len01), len02);

        answer += sub01 + overwrite_string + sub02;

        return answer;

        //참고 사이트 =  https://velog.io/@co_der/PROGRAMMERS-Java-%EB%AC%B8%EC%9E%90%EC%97%B4-%EA%B2%B9%EC%B3%90%EC%93%B0%EA%B8%B0
        // substring 같은 기본 개념은 알아야할듯
    }

    public static void main(String[] args){

        System.out.println(solution("He11Wor1d", "lloWorl", 2));
    }
}
