package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class V_Mosquito {

    static Scanner in = null;

    public static void main(String[] args) throws Exception {

        in = new Scanner(System.in).useLocale(Locale.US);

        long x = in.nextLong();
        long y = in.nextLong();
        long z = in.nextLong();
        in.nextLine();


        long min = 1;
        long max = x;
        long middle = min + (max - min) / 2;
        

        while(min != max)
        {
            if(isIn(min, 1, 1, middle, y, z))
                max = middle;
            else
                min = middle + 1;
            middle = min + (max - min) / 2;
        }
        long resultX = min;


        min = 1;
        max = y;
        middle = min + (max - min) / 2;
        while(min != max)
        {
            if(isIn(1, min, 1, x, middle, z))
                max = middle;
            else
                min = middle + 1;
            middle = min + (max - min) / 2;
        }
        long resultY = min;


        min = 1;
        max = z;
        middle = min + (max - min) / 2;
        while(min != max)
        {
            if(isIn(1, 1, min, x, y, middle))
                max = middle;
            else
                min = middle + 1;
            middle = min + (max - min) / 2;
        }
        long resultZ = min;

        System.out.printf("! %d %d %d\n", resultX, resultY, resultZ);
    }

    static boolean isIn(long x1, long y1, long z1, long x2, long y2, long z2)
    {
        System.out.printf("? %d %d %d %d %d %d\n", x1, y1, z1, x2, y2, z2);
        System.out.flush();
        return in.nextLine().equals("SI");
    }
}
