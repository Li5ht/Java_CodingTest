package Day08.q3;

public class Day08_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        int max = 0, maxArrayNum = 0;

        for (int i = 0; i < n ; i++){
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n ; i++){
            if (A[i] < max ) {
                max = A[i];
                maxArrayNum = i;
            }
        }

        System.out.println(max + " " + maxArrayNum);

        sc.close();
    }
}
