package Day03.q3;

import java.util.Scanner;

public class Day03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        /*int alarmHour = 0, alarmMin = 0;

        if (h == 0)
            h = 24;

        if (m < 45){
            m = m + 60;
            alarmMin = m - 45;
            alarmHour = h - 1;
        }
        else {
            alarmMin = m - 45;
            alarmHour = h;
        }

        System.out.printf("%d %d", alarmHour, alarmMin);*/

        if (m < 45){
            h --;
            m = 60 - (45 - m);

            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " "+m);
        }
        else
            System.out.println(h + " "+ (m-45));

        sc.close();
    }
}
