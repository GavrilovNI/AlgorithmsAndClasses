package Codewars2024;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Q_Recuento {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int  t = in.nextInt();

        int[] results = new int[t];

        int[] values = new int[1000];

        for(int q = 0; q < t; ++q)
        {
            int n = in.nextInt();
            int k = in.nextInt();

            for(int i = 0; i < n; ++i) 
                values[i] = in.nextInt();
            
            int l = 0;
            int r = n - 1;


            int result = 0;

            while (k > 0 && l <= n)
            {
                if(l == r)
                {
                    values[l] -= k;
                    if(values[l] <= 0)
                        result++;
                    break;
                }
                else
                {
                    var vl = values[l];
                    var vr = values[r];

                    if(vl == vr)
                    {
                        k -= vl + vr - 1;

                        if(k > 0)
                        {
                            values[l] = values[r] = 0;
                            result += 2;

                            k--;
                            l++;
                            r--;
                        }
                        else if(k == 0)
                        {
                            result++;
                            break;
                        }
                        else
                        {
                            break;
                        }
                    }
                    else if(vl < vr)
                    {
                        k -= vl + vl - 1;

                        if(k > 0)
                        {
                            values[l] = 0;
                            values[r] = vr - vl;
                            result ++;

                            k--;
                            l++;
                        }
                        else if(k == 0)
                        {
                        }
                        else
                        {
                            break;
                        }
                    }
                    else
                    {
                        k -= vr + vr;

                        if(k > 0)
                        {
                            values[l] = vl - vr;
                            values[r] = 0;
                            result ++;
                            r--;
                        }
                        else if(k == 0)
                        {
                            result++;
                            break;
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
        
            results[q] = result;
        }

        for(int q = 0; q < t; ++q)
            System.out.println(results[q]);

    }
}