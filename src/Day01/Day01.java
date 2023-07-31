package Day01;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("태국 나이를 입력하시오 : ");
        int taiLandYr = sc.nextInt();

        //int koreanYr = taiLandYr - 543;
        //System.out.println("한국 나이 : " + koreanYr);
        System.out.print(taiLandYr - 543);

        sc.close();

    }
}
