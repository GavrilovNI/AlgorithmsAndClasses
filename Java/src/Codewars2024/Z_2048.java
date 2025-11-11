package Codewars2024;

import java.util.Locale;
import java.util.Scanner;


public class Z_2048 {

    static long[][] values = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0},{0,0,0,0} };

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        int value = in.nextInt();

        values[y][x] = value;

        x = in.nextInt() - 1;
        y = in.nextInt() - 1;
        value = in.nextInt();

        values[y][x] = value;

        //print();


        int n = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; ++i)
        {
            var l = in.nextLine().split(" ");

            var c = l[0];
            if(c.equals(">"))
                moveDown();
            else if(c.equals("<"))
                moveUp();
            else if(c.equals("A"))
                moveLeft();
            else
                moveRight();

            x = Integer.parseInt(l[1]) - 1;
            y = Integer.parseInt(l[2]) - 1;
            value = Integer.parseInt(l[3]);

            values[y][x] = value;

            //print();
        }

        print();
    }

    static void print()
    {
        System.out.println();
        for(int x = 0; x < 4; ++x)
        {
            for(int y = 0; y < 4; ++y)
                System.out.print(values[y][x] + " ");
            System.out.println();
        }
        System.out.println();

    }

    /*
     * 2 2 0 2
     * 
     * 
     * 
     */

    static void moveDown() {
        for(int x = 0; x < 4; ++x)
        {
            int maxY = 3;
            for(int y = 3; y >=0; --y)
            {
                var value = values[y][x];
                if(value == 0)
                    continue;

                int last0 = -1;
                for(int i = y + 1; i <= maxY; ++i )
                {
                    var other = values[i][x];
                    if(other == 0)
                    {
                        last0 = i;
                        continue;
                    }

                    if(value != other)
                        break;
                    
                    last0 = -1;
                    values[i][x] = value + value;
                    values[y][x] = 0;
                    maxY = i - 1;
                    break;
                }
                if(last0 != -1)
                {
                    values[last0][x] = value;
                    values[y][x] = 0;
                    maxY = last0;
                }
            }
        }
    }

    static void moveUp() {
        for(int x = 0; x < 4; ++x)
        {
            int minY = 0;
            for(int y = 0; y < 4; ++y)
            {
                var value = values[y][x];
                if(value == 0)
                    continue;

                int last0 = -1;
                for(int i = y - 1; i >= minY; --i )
                {
                    var other = values[i][x];
                    if(other == 0)
                    {
                        last0 = i;
                        continue;
                    }

                    if(value != other)
                        break;
                    
                    last0 = -1;
                    values[i][x] = value + value;
                    values[y][x] = 0;
                    minY = i + 1;
                    break;
                }
                if(last0 != -1)
                {
                    values[last0][x] = value;
                    values[y][x] = 0;
                    minY = last0;
                }
            }
        }
    }

    static void moveLeft() {
        for(int y = 0; y < 4; ++y)
        {
            int minX = 0;
            for(int x = 0; x < 4; ++x)
            {
                var value = values[y][x];
                if(value == 0)
                    continue;

                int last0 = -1;
                for(int i = x - 1; i >= minX; --i )
                {
                    var other = values[y][i];
                    if(other == 0)
                    {
                        last0 = i;
                        continue;
                    }

                    if(value != other)
                        break;
                    
                    last0 = -1;
                    values[y][i] = value + value;
                    values[y][x] = 0;
                    minX = i + 1;
                    break;
                }
                if(last0 != -1)
                {
                    values[y][last0] = value;
                    values[y][x] = 0;
                    minX = last0;
                }
            }
        }

    }


    static void moveRight() {
        for(int y = 0; y < 4; ++y)
        {
            int maxX = 3;
            for(int x = 3; x >=0; --x)
            {
                var value = values[y][x];
                if(value == 0)
                    continue;

                int last0 = -1;
                for(int i = x + 1; i <= maxX; ++i )
                {
                    var other = values[y][i];
                    if(other == 0)
                    {
                        last0 = i;
                        continue;
                    }

                    if(value != other)
                        break;
                    
                    last0 = -1;
                    values[y][i] = value + value;
                    values[y][x] = 0;
                    maxX = i - 1;
                    break;
                }
                if(last0 != -1)
                {
                    values[y][last0] = value;
                    values[y][x] = 0;
                    maxX = last0;
                }
            }
        }
    }

}
