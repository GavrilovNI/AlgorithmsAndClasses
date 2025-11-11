package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class R_Subarray {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int n = in.nextInt();
        int k = in.nextInt();

        int sum = 0;
        int[] values = new int[n];

        int l = 0;
        int result = 0;

        for(int i = 0; i < n; ++i)
        {
            var value = in.nextInt();
            values[i] = value;

            sum += value;
            while(sum > k && l <= i)
            {
                sum -= values[l];
                ++l;
            }

            if(sum <= k)
            {
                var length = i - l + 1;
                if(length > result)
                    result = length;
            }
        }

        System.out.println(result);
    }
}