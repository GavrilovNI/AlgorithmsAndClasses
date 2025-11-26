import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        long a = in.nextLong();
        long b = in.nextLong();

        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(a, b));
        System.out.println(GreatestCommonDivisor.getLeastCommonMultiple(a, b));

        in.close();
    }
}
