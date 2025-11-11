package Codewars2024;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class J_Morse {

    static HashMap<String, String> map = new HashMap<String, String>() {{
        put(".-", "A");
        put("-...", "B");
        put("-.-.", "C");
        put("-..", "D");
        put(".", "E");
        put("..-.", "F");
        put("--.", "G");
        put("....", "H");
        put("..", "I");
        put(".---", "J");
        put("-.-", "K");
        put(".-..", "L");
        put("--", "M");
        put("-.", "N");
        put("---", "O");
        put(".--.", "P");
        put("--.-", "Q");
        put(".-.", "R");
        put("...", "S");
        put("-", "T");
        put("..-", "U");
        put("...-", "V");
        put(".--", "W");
        put("-..-", "X");
        put("-.--", "Y");
        put("--..", "Z");
        put(".----", "1");
        put("..---", "2");
        put("...--", "3");
        put("....-", "4");
        put(".....", "5");
        put("-....", "6");
        put("--...", "7");
        put("---..", "8");
        put("----.", "9");
        put("-----", "0");
}};

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        var n = in.nextInt();
        in.nextLine();
        var strs = in.nextLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            if(str.indexOf('~') >= 0)
                continue;
            
                result.append(map.get(str));
        }

        System.out.println(result);
    }
}