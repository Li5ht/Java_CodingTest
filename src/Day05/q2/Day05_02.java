package Day05.q2;

// import java.util.Scanner; -> 이번 문제에서눈 BufferedReader를 사용하여 적을 것
import java.io.*;
//BuffredReader/Writer 쓰기

public class Day05_02 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        StringBuilder  rd = new StringBuilder ();

        int n = Integer.parseInt(rd.readLine());

        int[] A = new int[n];
        int[] B = new int[n];
        int[] sum =new int[n];

        for (int i = 0; i < n; i++){
            A[i] = rd.readLine().split("");
            B[i] = rd.readLine().split("");
            sum[i] = A[i] + B[i];
        }

        for (int j = 0; j < n; j++){
            sum[j] = Integer.parseInt();
        }

        rd.close();

        //sc.close();
    }
}
