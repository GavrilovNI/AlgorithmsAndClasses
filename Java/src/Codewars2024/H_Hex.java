package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class H_Hex {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int t = in.nextInt();
        in.nextLine();

        String[] results = new String[t];

        for(int j = 0; j < t; ++j)
        {
            var str = in.nextLine();

            results[j] = str.format("rgb(%d, %d, %d)", Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
        }

        for(int j = 0; j < t; ++j)
            System.out.println(results[j]);
    }
}