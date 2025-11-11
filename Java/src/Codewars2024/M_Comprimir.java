package Codewars2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;


public class M_Comprimir {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int n = in.nextInt();
        in.nextLine();

        String[] results = new String[n];

        for(int j = 0; j < n; ++j)
        {
            var str = in.nextLine();

            String result = "";
            int count = 1;
            for(int i = 0; i < str.length(); ++i)
            {
                var c = str.charAt(i);
                if(i == str.length() - 1)
                {
                    if(count == 1)
                        result += c;
                    else
                        result += "" + count + c;
                    break;
                }
                var next = str.charAt(i + 1);

                if(c == next)
                {
                    count++;
                }
                else
                {
                    if(count == 1)
                        result += c;
                    else
                        result += "" + count + c;

                    count = 1;
                }
            }

            results[j] = result;
        }

        for(int j = 0; j < n; ++j)
            System.out.println(results[j]);
    }
}