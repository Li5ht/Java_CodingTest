package Day03.q1;

import java.util.Scanner;

public class Day03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           int year = sc.nextInt();

          /* if (year % 4 == 0  && (year % 100 != 0 || year % 400 == 0))
               System.out.println("1");
           else
               System.out.println("0");*/

        /*
        if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
        * */

        System.out.print((year%4==0)?((year%400==0)?"1":(year%100==0)?"0":"1"):"0");

        sc.close();
    }
}
