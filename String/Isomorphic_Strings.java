/*
 *Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for
every character of str1 to every character of str2 while preserving the order.
Note: All occurrences of every character in str1 should map to the same character in str2

Example 1:

Input:
str1 = aab
str2 = xxy
Output: 1
Explanation: There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.
Example 2:

Input:
str1 = aab
str2 = xyz
Output: 0
Explanation: There are two different
charactersin aab but there are three
different charactersin xyz. So there
won't be one to one mapping between
str1 and str2.
 */

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {
    public static boolean areIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        int n = str1.length();

        for (int i = 0; i < n; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (m1.containsKey(char1) && m1.get(char1) != char2) {
                return false;
            }

            if (m2.containsKey(char2) && m2.get(char2) != char1) {
                return false;
            }

            m1.put(char1, char2);
            m2.put(char2, char1);
        }

        return true;
    }
}
