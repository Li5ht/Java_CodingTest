package Day02.q1;

import java.util.Scanner;

public class Day02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //(1 <= a, b, c <= 10^12 => Long으로 계산할 것!

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);

        sc.close();
    }
}
