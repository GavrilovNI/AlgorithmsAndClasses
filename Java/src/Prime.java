public class Prime {
    
    public static boolean isPrime(long value)
    {
        if(value < 2)
            return false;
        if(value == 2)
            return true;
        if(value % 2 == 0)
            return false;

        var sqrt = Math.sqrt(value);
        for(long i = 3; i <= sqrt; i += 2)
        {
            if(value % i == 0)
                return false;
        }

        return true;
    }
}
