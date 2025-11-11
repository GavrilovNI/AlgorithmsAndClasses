package Codewars2024;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class S2_Sopa2 {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        
        int[] results = new int[26];

        ArrayList<Integer> chars = new ArrayList<Integer>();
        for(int i = 0; i < n; ++i)
        {
                var v = str.charAt(i) - 'a';
                results[v]++;
                if(chars.indexOf(v) == -1)
                    chars.add(v);
        }

        int minI = -1;
        int minV = n + 1;

        int maxI = -1;
        int maxV = 0;
        
        for(int i = 0; i < 26; ++i)
        {
            var v = results[i];
            if(v == 0)
                continue;

            if(v > maxV || v == maxV && chars.indexOf(i) < chars.indexOf(maxI))
            {
                maxV = v;
                maxI = i;
            }
            if(v < minV || v == minV && chars.indexOf(i) < chars.indexOf(minI))
            {
                minV = v;
                minI = i;
            }
        }

        System.out.println(((char)('a' + maxI)) + ": " + maxV);
        System.out.println(((char)('a' + minI)) + ": " + minV);
    }
}