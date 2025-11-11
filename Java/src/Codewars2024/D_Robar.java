package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class D_Robar {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int t = in.nextInt();
        double[] results = new double[t];

        for(int j = 0; j < t; ++j)
        {
            long p = 0;
            long c = 0;

            int n = in.nextInt();
            in.nextLine();
            var strs = in.nextLine().split(" ");
            for(int i = 0; i < n; ++i)
            {
                var ch = strs[i * 2].charAt(0);
                long number = Long.parseLong(strs[i * 2 + 1]);

                if(ch == 'C')
                    c += number;
                else
                    p += number;
            }

            if(p == 0)
                results[j] = 0;
            else
                results[j] = c * 60.0 / p;
        }

        for(int j = 0; j < t; ++j)
        {
            System.out.printf("Case %d:\n", j + 1);
            var value = results[j];
            if(value == 0)
            {
                System.out.println("Politicians are 0% richer");
                System.out.println("Citizens are 0% poorer");
            }
            else
            {
                System.out.printf(Locale.US, "Politicians are %.6f%% richer\n", value);
                System.out.println("Citizens are 60.000000% poorer");
            }
        }
    }
}