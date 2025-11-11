package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class T_Vampiro {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int t = in.nextInt();

        int[] results = new int[t];

        for(int k = 0; k < t; ++k)
        {
            int result = 0;

            int n = in.nextInt();
            long maxDiff = in.nextLong() * 2;

            long min = -1;
            long max = -1;

            min = max = in.nextLong();

            for(int i = 1; i < n; ++i)
            {
                long quality = in.nextLong();

                if(quality < min)
                    min = quality;
                else if(quality > max)
                    max = quality;

                if(max - min > maxDiff)
                {
                    ++result;
                    min = max = quality;
                }
            }

            results[k] = result;
        }

        for(int k = 0; k < t; ++k)
            System.out.println(results[k]);
    }
}