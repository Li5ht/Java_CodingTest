package Day04.q3;

import java.util.Scanner;

public class Day04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int buyTotal = sc.nextInt();
        int buyNum = sc.nextInt();
        int calTotal  = 0;

        int[][] receiptList = new int[buyNum][2];

        for (int i = 0; i < buyNum; i ++){
            for (int j = 0; j < 2; j++) {
                receiptList[i][j] = sc.nextInt();
            }
            calTotal = calTotal + receiptList[i][0] *receiptList[i][1];
        }

        if (buyTotal == calTotal)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close(); 
    }
}

