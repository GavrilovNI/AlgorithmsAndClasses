package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class E_Vocales {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var str = in.nextLine();

        int result = 0;
        for(int i = 0; i < str.length(); ++i)
        {
            var c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                result++;
        }

        System.out.println(result);
    }
}