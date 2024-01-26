package com.codingTest.PCCP.MockTest.Q1;

import java.util.*;

public class Q1 {
    public String solution(String input_string) {
        String answer = "";
        char tempChar;
        int tempCnt = 0;
        int repeatCnt = 0;

        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> originHm = new HashMap<>();
        HashMap<Character, Integer> repeatChkHm = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < input_string.length(); i++) {
            q.offer(input_string.charAt(i)); // e d e a a a b b c c d
        }

        while (!q.isEmpty()) {

            tempChar = q.poll();

            if (originHm.get(tempChar) == null) { // originHm에는 key값으로 알파벳이, value값으로 해당 알파벳의 총 카운트가 들어갈 것이다.
                originHm.put(tempChar, 1);
                repeatChkHm.put(tempChar, 1);
            } else {
                tempCnt = originHm.get(tempChar) + 1;
                originHm.put(tempChar, tempCnt);
            }

            if (!q.isEmpty()) { // AABBAA일 경우 // originHm A : 4, B : 2 // repeatChkHm A : 3, B : 2

                if (tempChar == q.peek()) { // 연속되는 알파벳이라면
                    repeatCnt = repeatChkHm.get(tempChar) + 1;
                    repeatChkHm.put(tempChar, repeatCnt);
                }
            }
        }

        for (char key : originHm.keySet()) {

            if (originHm.get(key) != repeatChkHm.get(key) && originHm.get(key) > 1) {
                list.add(key);
            }
        }

        if (list.size() == 0) {
            answer = "N";
        } else {
            Collections.sort(list);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }

            answer = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input_string = "edeaaabbccd";
        System.out.println(solution(input_string));
    }
}
