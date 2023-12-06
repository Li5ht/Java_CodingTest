package com.codingTest.Programmers.Day03.q2;

public class Day03_02 {
    public static void main(String[] args) {

        System.out.println(solution("xyZAB", "ABCxy"));
    }

    public static String solution(String s1, String s2) {
        String answerS1 = "";
        String answerS2 = "";
        String answer = "";

        //1. startsWith 이용하여 겹치는 내용 비교 후 문자열 합치기 (s1이 앞인 버전 / s2이 앞인 버전)
        for (int i = 0; i < s1.length(); i++) {
            if (s2.startsWith(s1.substring(s1.length() - i, s1.length()))) {
                answerS1 = s1 + s2.substring(i);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s1.startsWith(s2.substring(s2.length() - i, s2.length()))) {
                answerS2 = s2 + s1.substring(i);
            }
        }

        //2. s1버전과 s2버전 길이 비교
        if (answerS1.length() < answerS2.length()) {
            answer = answerS1;
        } else if (answerS1.length() < answerS2.length()) {
            answer = answerS2;
        } else {
            //3. compareTo 이용하여 길이가 같을 시 사전 순 비교
            if (answerS1.compareTo(answerS2) > 0) {
                answer = answerS1;
            } else {
                answer = answerS2;
            }
        }

        return answer;
    }

}
