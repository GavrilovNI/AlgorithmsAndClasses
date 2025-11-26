public class GreatestCommonDivisor {
    
    public static long getGreatestCommonDivisor(long a, long b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        if(b > a)
        {
            long c = b;
            b = a;
            a = c;
        }

        long r = a % b;

        while (r != 0)
        {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }

    public static long getLeastCommonMultiple(long a, long b)
    {
        var gcd = getGreatestCommonDivisor(a, b);
        double p = Math.abs(1.0 * a * b);

        return (long)(p / gcd);
    }
}
