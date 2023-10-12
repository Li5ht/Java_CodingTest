package Day07.q1;

import java.util.Scanner;

public class Day07_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* => While문이 아니라 For문을 써서 틀림
        int[] a = new int[6];
        int[] b = new int[6];

        a[5] = 0;
        b[5] = 0;


        for (int i=0; i<5; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i=0; i<5; i++){
            System.out.println(a[i]+b[i]);
        }*/

        while(true) {

            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                sc.close();
                break;
            }
            System.out.println(A + B);
        }
    }
}
