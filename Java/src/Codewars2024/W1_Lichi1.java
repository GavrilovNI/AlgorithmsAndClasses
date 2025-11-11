package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class W1_Lichi1 {

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

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        
        int n = in.nextInt();

        Fenwick fenwick = new Fenwick(n);

        for(int i = 0; i < n; ++i) {
            long value = in.nextLong();
            
            if(!isPrime(value))
                value = 0;

            fenwick.change(i + 1, value);
        }

        int lines = in.nextInt();
        long[] results = new long[lines];
    
        for(int i = 0; i < lines; ++i) {
            
            int l = in.nextInt();
            int r = in.nextInt();

            results[i] = fenwick.sumRange(l, r);
        }

        for(int i = 0; i < lines; ++i)
            System.out.println(results[i]);
    }


}

/*
 * binary indexed tree
 * prefix sum speed - O(logN)
 * change valiue[i] - O(logN)
 * 
 * LSB - least significanmt bit
 *
 * bit[i] = sum (values[i - LSB(i) + 1] to values[i])
 * 
 * i = 12 (1100)
 * LSB(12) = 4 (0100)
 * bit[12] = sum (values[12-4+1] to values[12]) = sum (9 to 12)
 * 
 * i = 8 (1000)
 * LSB(8) = 8 (1000)
 * bit[8] = sum (values[8-8+1] to values[8]) = sum (1 to 8)
 */

class Fenwick
{
    /*
     * bit[0]  (00000) = 0
     * bit[1]  (00001) = sum values[1..1]
     * bit[2]  (00010) = sum values[1..2]
     * bit[3]  (00011) = sum values[3..3]
     * bit[4]  (00100) = sum values[1..4]
     * bit[5]  (00101) = sum values[5..5]
     * bit[6]  (00110) = sum values[5..6]
     * bit[7]  (00111) = sum values[7..7]
     * bit[8]  (01000) = sum values[1..8]
     * bit[9]  (01001) = sum values[9..9]
     * bit[10] (01010) = sum values[9..10]
     * bit[11] (01011) = sum values[11..11]
     * bit[12] (01100) = sum values[9..12]
     * bit[13] (01101) = sum values[13..13]
     * bit[14] (01110) = sum values[13..14]
     * bit[15] (01111) = sum values[15..15]
     * bit[16] (10000) = sum values[1..16]
     */
    private long[] bit;
    private int count;

    public Fenwick(int count) {
        this.count = count;
        bit = new long[count + 1];
    }

    /*
     * update the value at i by delta
     * values[i] += delta
     * 
     * i = 5
     * changing
     * bit[5] (101)
     * bit[6] (110)
     * bit[8] (1000)
     * bit[16] (10000)
     * etc.
     */
    public void change(int i, long delta) {
        if(i == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");

        for (; i <= count; i += (i & -i)) // i & -i - LSB(i). 12 (1100) -> 100
            bit[i] += delta;
    }

    /*
     * get sum of values in range [1,i]
     * 
     * i = 5 (101)
     * res += bit[5] = sum (5-1+1 to 5) = sum (5 to 5)
     * i -= (i & -i) = (5 & -5) = (0..0101 & 1...1011) = 1
     * 
     * i = 4 (100)
     * res += bit[4] = sum (4-4+1 to 4) = sum (1 to 4)
     * i -= (i & -i) = (4 & -4) = (0..0100 & 1...1100) = 4
     */
    public long sumPrefix(int i) {
        long res = 0;

        for (; i > 0; i -= (i & -i))
            res += bit[i];

        return res;
    }

    /*
     * get sum of values in range [l,r]
     */
    public long sumRange(int l, int r) {
        if(l == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");

        return sumPrefix(r) - sumPrefix(l - 1);
    }

    public long get(int i) {
        if(i == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");

        return sumPrefix(i) - sumPrefix(i - 1);
    }

    // slow
    public void set(int i, long value) {
        if(i == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");

        change(i, value - get(i));
    }
}
