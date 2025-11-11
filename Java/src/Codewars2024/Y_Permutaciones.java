package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class Y_Permutaciones {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int n = in.nextInt();
        long k = in.nextLong();

        int[] initial = new int[n];
        int[] values = new int[n];

        for(int i = 0; i < n; ++i)
        {
            values[i] = initial[i] = in.nextInt();
        }

        int[] values2 = new int[n];
        for(int i = 0; i < k; ++i)
        {
            //System.out.print(i + ": ");
            boolean same = true;
            for(int j = 0; j < n; ++j)
            {
                var ini = initial[j];
                var v = values2[j] = values[ini - 1]; // initial[values[j] - 1] // уебанское задание

                if(v != ini)
                    same = false;
            }

            var x = values;
            values = values2;
            values2 = x;

            //print(values);

            if(same)
            {
                k %= (i + 1);
                i = -1;

                //System.out.println("same");
            }
        }

        print(values);
    }

    static void print(int[] values)
    {
        int n = values.length;

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; ++i)
        {
            result.append(values[i]);
            if(i != n - 1)
                result.append(' ');
        }

        System.out.println(result);
    }
}