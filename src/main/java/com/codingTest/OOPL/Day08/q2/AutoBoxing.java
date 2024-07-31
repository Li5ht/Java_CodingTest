package com.codingTest.OOPL.Day08.q2;

public class AutoBoxing {
    public static int add(int x, int y){
        return (x+y);
    }
    public static Integer addRef(Integer x, Integer y){
        return (x+y);
    } // 메소드의 매개변수로 사용, 오토 언방식 -> 오토박싱

    public static void main(String[] args){
        @SuppressWarnings("deprecation") // auto-boxing 경고 없애기
        Integer x = 10; // 오토박싱
        Integer y = 20; // 오토박싱

        int z = add(x,y); // 오토 박싱, 대입문
        System.out.println(z);//오토언박싱

        int w = addRef(x,y); // 오토언박싱, 대입문
        System.out.println(w);//오토언박싱

        Integer v = addRef(10, 20);//오토 언박싱, 대입문
        System.out.println(v); // 오토언박싱
    }
}
