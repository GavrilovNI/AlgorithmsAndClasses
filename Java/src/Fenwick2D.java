public class Fenwick2D {
    private final int sizeX, sizeY;
    private final long[][] bit;

    public Fenwick2D(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
        bit = new long[x + 1][y + 1];
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
