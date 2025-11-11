package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class F_Dinero {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var str = in.nextLine();

        int result = 0;
        for(int i = 0; i < str.length(); ++i)
            result += str.charAt(i) - '0';

        System.out.println(result);
    }
}