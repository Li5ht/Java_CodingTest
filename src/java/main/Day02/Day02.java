import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine());
        System.out.println(A * B);
    }
}