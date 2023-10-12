package Day07.q2;

import java.util.Scanner;

public class Day07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int i = 0; => i는 사용하지 않음

        while(sc.hasNextInt()) {

            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }

        sc.close();
    }
}
