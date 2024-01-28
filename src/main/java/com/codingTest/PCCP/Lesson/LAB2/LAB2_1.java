package com.codingTest.PCCP.Lesson.LAB2;

import java.util.*;

public class LAB2_1 {
    public int[] solution(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);
        int max = copyArr[copyArr.length-1];

        List<Integer> indexList = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == max){
                indexList.add(i);
            }
        }

        int[] answer = new int[indexList.size()];
        for(int i = 0; i<indexList.size(); i++){
            answer[i] = indexList.get(i); // i index 값 가져오기
        }

        return answer;
    }
}