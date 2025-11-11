package Codewars2024;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;


public class P_Reinado {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int n = in.nextInt();
        in.nextLine();

        String[] results = new String[n];

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for(int i = 0; i < n; ++i)
        {
            var str = in.nextLine();
            
            var x = str.split(" ");
            
            var start = LocalDate.parse(x[2], dtf);
            var end = LocalDate.parse(x[3], dtf);
            
            var days = ChronoUnit.DAYS.between(start, end) + 1;
            results[i] = x[0] + " " + x[1] + " fue rey durante " + days + " dias";
        }

        
        for(int i = 0; i < n; ++i)
            System.out.println(results[i]);
    }
}