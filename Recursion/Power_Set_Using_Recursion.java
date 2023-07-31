/*
 * You are given a string. You need to print the lexicographically sorted power-set of the string.
Note: The string s contains lowercase letter of alphabet.

Example 1:

Input:
s = a
Output: a
Explanation: empty string and a 
are only sets.
Example 2:

Input:
s = abc
Output: a ab abc ac b bc c
Explanation: empty string, 
a, ab, abc, ac, b, bc, c 
are the sets.
 */

import java.util.ArrayList;

public class Power_Set_Using_Recursion {
    static ArrayList<String> powerSet(String s) {
        // add your code here
        ArrayList<String> ans = new ArrayList<String>();
        powersetutil(s, ans, 0, "");

        return ans;
    }

    static void powersetutil(String str, ArrayList<String> v, int index, String curr) {
        int n = str.length();

        if (index == n) {
            v.add(curr);
            return;
        }

        powersetutil(str, v, index + 1, curr);
        powersetutil(str, v, index + 1, curr + str.charAt(index));
    }
}
