package Codewars2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;


public class N_Numeros {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int t = in.nextInt();

        boolean[] results = new boolean[t];
        for(int i = 0; i < t; ++i)
        {
            long n = in.nextLong();
            results[i] = isMagic(n);
        }

        for(int i = 0; i < t; ++i)
            System.out.println(results[i] ? "Si :)" : "No :(");
    }

    static boolean isMagic(long value)
    {
        if(value < 100)
            return false;

        if(value % 2 != 0 && value % 3 != 0 && value % 5 != 0)
            return false;

        int sum = 0;
        int count = 0;

        long other = 0;

        while (value > 0) {
            int d = (int)(value % 10);
            value /= 10;

            sum += d;
            if(d % 2 == 1)
                count++;

            other = other * 10 + d;
        }

        return count == 3 && other % 7 != 0 && isPrime(sum);
    }

    public static boolean isPrime(long value)
    {
        if(value < 2)
            return false;
        if(value == 2)
            return true;

        var sqrt = Math.sqrt(value);
        for(long i = 2; i <= sqrt; ++i)
        {
            if(value % i == 0)
                return false;
        }

        return true;
    }
}