/*
Write a Java program to convert a Roman numeral string into its equivalent integer value. Roman numerals are based on the following symbols and their values:

    I = 1
    V = 5
    X = 10
    L = 50
    C = 100
    D = 500
    M = 1000

Conversion Rules:
If a smaller numeral appears before a larger numeral, subtract the smaller value from the larger value.
    Example: IV = 5 - 1 = 4, IX = 10 - 1 = 9.
If a smaller numeral appears after a larger numeral, add their values.
    Example: VI = 5 + 1 = 6, XII = 10 + 2 = 12.
Input:
    A valid Roman numeral string (e.g., "IX", "MCMXCIV").
Output:
    The equivalent integer value of the Roman numeral.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int num = 0;

        Map<Character, Integer> mapp = new HashMap<>();

        mapp.put('I',1);
        mapp.put('V',5);
        mapp.put('X',10);
        mapp.put('L',50);
        mapp.put('C',100);
        mapp.put('D',500);
        mapp.put('M',1000);

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (i + 1 < str.length() && mapp.get(c) < mapp.get(str.charAt(i + 1)) ) {
                num += mapp.get(str.charAt(i + 1)) - mapp.get(c);
                i++;
            } else {
                num += mapp.get(c);
            }
        }

        System.out.println(num);
    }
}