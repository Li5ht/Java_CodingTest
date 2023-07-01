import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] arr1 = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        float[] arr2 = {4.5F, 4.0F, 3.5F, 3.0F, 2.5F, 2.0F, 1.5F, 1.0F, 0F};
        float sum1 = 0, sum2 = 0;
        for(int i=0; i<20; i++) {
            String[] arr = br.readLine().split(" ");
            if(!arr[2].equals("P")) {
                int idx = Arrays.binarySearch(arr1, arr[2]);
                sum1 += Float.parseFloat(arr[1]);
                sum2 += Float.parseFloat(arr[1]) * arr2[idx];
            }
        }
        System.out.print((float)Math.round((float)sum2/sum1*1000000)/1000000);
    }
}
