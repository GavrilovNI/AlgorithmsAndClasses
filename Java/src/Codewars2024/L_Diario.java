package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class L_Diario {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var n = in.nextLine().split(" ");
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n.length; ++i) {
            
            var x = new StringBuilder(n[i]).reverse().toString();
            result.append(x);
            if(i != n.length - 1)
                result.append(' ');
        }

        System.out.println(result);

    }
}