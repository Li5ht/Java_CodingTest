package com.codingTest.Programmers.Day02.q1;

import java.util.Scanner;

public class Day02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++){
            char str = a.charAt(i);
            if(Character.isUpperCase(str)){
                answer += Character.toLowerCase(str);
            }else{
                answer += Character.toUpperCase(str);
            }
        }

        // 이런 방법도 있다 (다른 사람 프로그래머스 정답)
        /*for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        }*/

        //ㅇ건 아스키코드 방법 (다른 사람 프로그래머스 정답)
        /*if(Character.isUpperCase(c)) {
            System.out.print((char)(c+32));
        }
        else {
            System.out.print((char)(c-32));
        }*/

        System.out.println(answer);
    }
}
