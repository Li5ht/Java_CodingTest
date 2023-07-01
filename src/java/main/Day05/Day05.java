import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

       char[][] result = new char[5][15];

       for(int i=0; i<5; i++) {
           result[i] = br.readLine().toCharArray();
       }
       for(int i=0; i<15; i++) {
           for(int j=0; j<5; j++) {
                if(result[j].length > i) {
                    sb.append(result[j][i]);
                }
           }
       }
       System.out.println(sb);
    }
}