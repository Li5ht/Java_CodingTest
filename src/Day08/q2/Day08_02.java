package Day08.q2;

public class Day08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[n];

        //int[] small = new int[n];
        //int add = 0;

        for (int i = 0; i < n ; i++){
            A[i] = sc.nextInt();
           /* if (A[i] < x){
                small[add] = A[i];
                add++;
            }*/
        }

        for (int i = 0; i < n ; i++){
            if (A[i] < x) {
                System.out.print(A[i] + " ");
            }
        }

        sc.close();
    }
}
