package Day06.q3;

import java.util.Scanner;

public class Day06_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

       /*for (int i = 1; i <= N; i++) {
           for (int j = 1 ; j <= N - 1; j++){ // 1이 아닌 i로 해서 틀림
               System.out.print(" ");
           }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
