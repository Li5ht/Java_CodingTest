import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String S = br.readLine();

        boolean result = isPalindrome(S, 0, S.length() - 1);
        if(result) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    public static boolean isPalindrome(String S, int start, int end) {
        boolean result = true;
        if(start <= end) {
            if(S.charAt(start) == S.charAt(end)) {
                result = isPalindrome(S, ++start, --end);
            } else {
                return false;
            }
        }
        return result;
    }
}