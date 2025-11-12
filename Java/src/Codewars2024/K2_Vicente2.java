package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class K2_Vicente2 {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var n = in.nextInt();
        long[] prefixSum = new long[n + 1];

        long sum = 0;
        long[] values = new long[n];
        for (int i = 0; i < n; ++i) {
            var value = values[i] = in.nextLong();
            sum += value;
            prefixSum[i + 1] = sum;
        }

        long[][] dp = new long[n][n];

        for(int length = 1; length <= n; ++length)
        {
            for(int i = 0; i < n - length + 1; ++i)
            {
                int j = i + length - 1;
                if(i == j)
                {
                    dp[i][j] = values[i];
                }
                else
                {
                    var currSum = prefixSum[j + 1] - prefixSum[i];

                    dp[i][j] = Math.min(values[i] + (currSum - values[i] - dp[i + 1][j]),
                            values[j] + (currSum - values[j] - dp[i][j - 1]));
                }
            }
        }

        long vicente = dp[0][n - 1];
        long fermin = sum - vicente;

        if(fermin == vicente)
            System.out.println("Empate");
        else if(vicente < fermin)
            System.out.println("Vicente");
        else
            System.out.println("Fermin");
    }
}