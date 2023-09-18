package Day04.q2;

import java.util.Scanner;

public class Day04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        //풀이 1
        /*int count = 0;
        int prize = 0;
        int same = 0;

       *//* if ((a<=0 || b<=0 || c<=0) || (a >7 || b>7 || c>8)){
            System.out.println("ERROR. PLEASE ENTER THE NUMBER BETWEEN 1 TO 6");
            break;
        }*//*

        if ( a == b ){
            count++;
            same = a;

        }
        else if ( b == c ){
            count++;
            same = b;
        }
        else if (c == a){
            count++;
            same = c;
        }

        if (count >= 2){
            prize = 10000 + same*1000;
        }
        else if (count == 1){
            prize = 1000 + same*100;
        }
        else{
            int large = 0;

            if (a > b && a > c){
                large = a;
            }
            else if (b > a && b > c){
                large = b;
            }
            else if (c > a && c > a){
                large = c;
            }
            prize = large*100;
        }

        System.out.println(prize);

        sc.close();*/

        //방법 2
        // 만약 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {
            int max;
            // 만약 a > b 라면
            if (a > b) {
                // c > a > b 라면
                if (c > a) {
                    max = c;
                }
                // a > (b, c)
                else {
                    max = a;
                }
            }
            // b > a 라면
            else {
                // c > b > a 라면
                if (c > b) {
                    max = c;
                }
                // b > (a, c)
                else {
                    max = b;
                }
            }
            System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
            // 3개의 변수가 모두 같은 경우
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            else {
                // a가 b혹은 c랑만 같은 경우
                if(a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                // b가 c랑 같은 경우
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
        sc.close();
    }
}
