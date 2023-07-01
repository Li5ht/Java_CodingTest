import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day03 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

       int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

       while(input[0] != 0 && input[1] != 1) {
           if (input[0] / input[1] > 0 && input[0] % input[1] == 0) {
               System.out.println("multiple");
           } else if (input[1] / input[0] > 0 && input[1] % input[0] == 0) {
               System.out.println("factor");
           } else {
               System.out.println("neither");
           }
           input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       }
    }
}