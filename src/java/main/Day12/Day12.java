import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day12  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i< N; i++) {
            list.add(i+1);
        }

        int i, j, k;
        for(int a=0; a < M; a++) {
            input = br.readLine().split(" ");
            i = Integer.parseInt(input[0]);
            j = Integer.parseInt(input[1]);
            k = Integer.parseInt(input[2]);

            int val = list.get(i-1);
            int end = list.get(k-1);

            while(val != end) {
                list.remove(i-1);
                list.add(j-1, val);
                val = list.get(i-1);
            }
        }

        for(int a=0; a< N; a++) {
            sb.append(list.get(a) + " ");
        }

        System.out.println(sb);
    }
}