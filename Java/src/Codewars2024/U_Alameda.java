package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class U_Alameda {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int y = in.nextInt();
        int x = in.nextInt();
        in.nextLine();

        var fenwick = new Fenwick2D(x, y);

        for(int i = 0; i < y; ++i)
        {
            var line = in.nextLine();
            for(int ii = 0; ii < x; ++ii)
            {
                var c = line.charAt(ii);
                if(c == '#')
                    fenwick.change(ii + 1, i + 1, 1);
            }
        }


        int q = in.nextInt();
        int[] results = new int[q];

        for(int i = 0; i < q; ++i)
        {
            int y1 = in.nextInt();
            int x1 = in.nextInt();
            int y2 = in.nextInt();
            int x2 = in.nextInt();

            results[i] = (int)fenwick.sumRange(x1, y1, x2, y2);
        }
        
        for(int i = 0; i < q; ++i)
            System.out.println(results[i]);
    }
}

class Fenwick2D {
    private final int sizeX, sizeY;
    private final byte[][] bit;

    public Fenwick2D(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
        bit = new byte[x + 1][y + 1];
    }

    public void change(int x, int y, long delta) {
        if(x == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");
        if(y == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");

        for (int i = x; i <= sizeX; i += i & -i) {
            for (int j = y; j <= sizeY; j += j & -j) {
                bit[i][j] += delta;
            }
        }
    }

    public long sumPrefix(int x, int y) {
        long res = 0;
        for (int i = x; i > 0; i -= i & -i) {
            for (int j = y; j > 0; j -= j & -j) {
                res += bit[i][j];
            }
        }
        return res;
    }

    public long sumRange(int x1, int y1, int x2, int y2) {
        return sumPrefix(x2, y2)
             - sumPrefix(x1 - 1, y2)
             - sumPrefix(x2, y1 - 1)
             + sumPrefix(x1 - 1, y1 - 1);
    }

    public long get(int x, int y) {
        if(x == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");
        if(y == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");

        return sumRange(x, y, x, y);
    }

    //slow
    public void set(int x, int y, long value) {
        if(x == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");
        if(y == 0)
            throw new IllegalArgumentException("Indexing in Fenwick starts from 1");

        change(x, y, value - get(x, y));
    }
}