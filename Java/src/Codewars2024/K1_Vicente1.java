package Codewars2024;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class K1_Vicente1 {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var n = in.nextInt();
        
        int[] values = new int[n];

        for (int i = 0; i < n; ++i) {
            values[i] = in.nextInt();
        }

        Arrays.sort(values);

        long a = 0;
        long b = 0;

        for (int i = 0; i < n; i += 2)
        {
            a += values[i];
            if(i + 1 < n)
                b += values[i + 1];
        }

        if(a == b)
            System.out.println("Empate");
        else if(a < b)
            System.out.println("Vicente");
        else
            System.out.println("Fermin");
    }
}