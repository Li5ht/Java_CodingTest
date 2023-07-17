import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day15 {
    public static int solution(int[] arr) {
        if (arr.length <= 2) {
            return Arrays.stream(arr).sum();
        }

        Arrays.sort(arr);
        int sum = arr[0] + arr[1];
        for (int i = 2; i < arr.length; i++) {
            sum = sum * 2 + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solution(arr));
    }

