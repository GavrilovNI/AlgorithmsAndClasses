package Codewars2024;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;


public class B_Triangulo {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var n = in.nextInt();
        
        if(n==1)
        {
            System.err.println(" 1");
            System.err.println("11");
        }
        else if(n==2)
        {
            System.err.println("   2");
            System.err.println("  212");
            System.err.println(" 21112");
            System.err.println("2222222");
        }
        else if(n==3)
        {
            System.err.println("     3");
            System.err.println("    323");
            System.err.println("   32123");
            System.err.println("  3211123");
            System.err.println(" 322222223");
            System.err.println("33333333333");
        }
        else if(n==4)
        {
            System.err.println("       4");
            System.err.println("      434");
            System.err.println("     43234");
            System.err.println("    4321234");
            System.err.println("   432111234");
            System.err.println("  43222222234");
            System.err.println(" 4333333333334");
            System.err.println("444444444444444");
        }
        else if(n==5)
        {
            System.err.println("         5");
            System.err.println("        545");
            System.err.println("       54345");
            System.err.println("      5432345");
            System.err.println("     543212345");
            System.err.println("    54321112345");
            System.err.println("   5432222222345");
            System.err.println("  543333333333345");
            System.err.println(" 54444444444444445");
            System.err.println("5555555555555555555");
        }
        else if(n==6)
        {
            System.err.println("           6");
            System.err.println("          656");
            System.err.println("         65456");
            System.err.println("        6543456");
            System.err.println("       654323456");
            System.err.println("      65432123456");
            System.err.println("     6543211123456");
            System.err.println("    654322222223456");
            System.err.println("   65433333333333456");
            System.err.println("  6544444444444444456");
            System.err.println(" 655555555555555555556");
            System.err.println("66666666666666666666666");
        }
        else if(n==7)
        {
            System.err.println("             7");
            System.err.println("            767");
            System.err.println("           76567");
            System.err.println("          7654567");
            System.err.println("         765434567");
            System.err.println("        76543234567");
            System.err.println("       7654321234567");
            System.err.println("      765432111234567");
            System.err.println("     76543222222234567");
            System.err.println("    7654333333333334567");
            System.err.println("   765444444444444444567");
            System.err.println("  76555555555555555555567");
            System.err.println(" 7666666666666666666666667");
            System.err.println("777777777777777777777777777");
        }
        else if(n==8)
        {
            System.err.println("               8");
            System.err.println("              878");
            System.err.println("             87678");
            System.err.println("            8765678");
            System.err.println("           876545678");
            System.err.println("          87654345678");
            System.err.println("         8765432345678");
            System.err.println("        876543212345678");
            System.err.println("       87654321112345678");
            System.err.println("      8765432222222345678");
            System.err.println("     876543333333333345678");
            System.err.println("    87654444444444444445678");
            System.err.println("   8765555555555555555555678");
            System.err.println("  876666666666666666666666678");
            System.err.println(" 87777777777777777777777777778");
            System.err.println("8888888888888888888888888888888");
        }
        else if(n==9)
        {
            System.err.println("                 9");
            System.err.println("                989");
            System.err.println("               98789");
            System.err.println("              9876789");
            System.err.println("             987656789");
            System.err.println("            98765456789");
            System.err.println("           9876543456789");
            System.err.println("          987654323456789");
            System.err.println("         98765432123456789");
            System.err.println("        9876543211123456789");
            System.err.println("       987654322222223456789");
            System.err.println("      98765433333333333456789");
            System.err.println("     9876544444444444444456789");
            System.err.println("    987655555555555555555556789");
            System.err.println("   98766666666666666666666666789");
            System.err.println("  9877777777777777777777777777789");
            System.err.println(" 988888888888888888888888888888889");
            System.err.println("99999999999999999999999999999999999");
        }
    }
}