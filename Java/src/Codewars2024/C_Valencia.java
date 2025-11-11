package Codewars2024;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;


public class C_Valencia {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var str = in.nextLine();
        LocalTime t = LocalTime.parse( str) ;
        t = t.plusMinutes(30);

        System.out.println("PELIGRO DE INUNDACION: Evita entrar a sotanos y bajos, evita desplazamientos y busca un lugar alto. La inundación llegara a las " + t);
    }
}