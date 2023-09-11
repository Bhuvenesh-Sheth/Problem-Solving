/*
 * Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.

Example 1:

Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.
Example 2:

Input:
s1 = abcs
s2 = cxzca
Output: bsxz
Explanation: The common characters of s1
and s2 are: a,c. The uncommon characters
of s1 and s2 are b,s,x and z. Thus the
modified string with uncommon characters
concatenated is bsxz.
Your Task:
The task is to complete the function concatenatedString() which removes the common characters, concatenates, and returns the string. If all characters are removed then return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |Length of Strings|

Constraints: 
1 <= |Length of Strings| <= 104
 */
public class Remove_common_characters_and_concatenate {
    public static String concatenatedString(String s1, String s2) {
        StringBuilder ans = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) == -1) {
                ans.append(c);
            }
        }

        for (char c : s2.toCharArray()) {
            if (s1.indexOf(c) == -1) {
                ans.append(c);
            }
        }

        return ans.length() == 0 ? "-1" : ans.toString();
    }
}
