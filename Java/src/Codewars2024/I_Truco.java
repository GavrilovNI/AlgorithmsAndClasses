package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class I_Truco {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int t = in.nextInt();

        long[] results = new long[t];

        for(int j = 0; j < t; ++j)
        {
            int n = in.nextInt();
            in.nextLine();

            long result = 0;

            for(int i = 0; i < n; ++ i)
            {
                var strs = in.nextLine().split(" ");
                int a = Integer.parseInt(strs[0]);
                int b = Integer.parseInt(strs[2]);

                var sign = strs[1];

                int r = 0;
                if(sign.equals("+"))
                    r = a + b;
                else if(sign.equals("-"))
                    r = a - b;
                else
                    r = a * b;

                result += Math.max(1, r);
            }

            results[j] = result;
        }

        for(int j = 0; j < t; ++j)
            System.out.println(results[j]);
    }
}