package Day06.q1;

import java.util.Scanner;

public class Day06_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] sum = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum[i] = a[i] + b[i];
        }

        for (int i=0; i<n; i++){
            System.out.println("Case "+(i+1)+": "+a[i]+" + "+b[i]+" = "+sum[i]);
        }

        sc.close();
    }
}
