public class Prime {
    
    public static boolean isPrime(long value)
    {
        if(value < 2)
            return false;
        if(value == 2)
            return true;

        var sqrt = Math.sqrt(value);
        for(long i = 2; i <= sqrt; ++i)
        {
            if(value % i == 0)
                return false;
        }

        return true;
    }
}
