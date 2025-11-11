package Codewars2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;


public class O12_Permutaciones12 {

    public static void main2(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        String str = in.nextLine();


        HashSet<String> result = new HashSet<String>();
        ArrayList<Character> leftChars = new ArrayList<Character>(str.chars().mapToObj(x -> (char)x).toList());

        
        Find("", leftChars, result);

        for(var x : result)
            System.out.println(x);
    }

    static void Find(String prefix, ArrayList<Character> leftChars, HashSet<String> result)
    {
        if(leftChars.size() == 1)
        {
            result.add(prefix + leftChars.get(0));
            return;
        }

        for(int i = 0; i < leftChars.size(); ++i)
        {
            var newPrefix = prefix + leftChars.get(i);
            ArrayList<Character> newLeftChars = new ArrayList<>(leftChars);
            newLeftChars.remove(leftChars.get(i));

            Find(newPrefix, newLeftChars, result);
        }
    }
}