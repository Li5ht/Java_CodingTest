import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for(int j=1; j <= N; j++) {
            String str = "";
            for (int i = 1; i <= N+j-1; i++) {
                if(i <= N-j) {
                    sb.append(" ");
                    str += " ";
                } else {
                    sb.append("*");
                    str += "*";
                }
            }
            sb.append("\n");
            str += "\n";
            stack.push(str);
        }
        System.out.print(sb);
        stack.pop();
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
