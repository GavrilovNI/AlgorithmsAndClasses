package Codewars2024;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class S1_Sopa1 {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        
        int[] results = new int[26];
        ArrayList<Integer> chars = new ArrayList<Integer>();

        for(int i = 0; i < n; ++i)
        {
            var c = str.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                var v = c - 'a';
                results[v]++;
                if(chars.indexOf(v) == -1)
                    chars.add(v);
            }
            else if(c >= 'A' && c <= 'Z')
            {
                var v = c - 'A';
                results[v]++;
                if(chars.indexOf(v) == -1)
                    chars.add(v);
            }
        }

        for(int i : chars)
            System.out.println(((char)('A' + i)) + ": " + results[i]);
    }
}