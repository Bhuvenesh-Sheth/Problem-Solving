/*
 * Given a string S consisting of only uppercase and lowercase characters.
 * The task is to sort uppercase and lowercase letters separately such that
 * if the ith place in the original string had an Uppercase character then
 * it should not have a lowercase character after being sorted and vice versa.

Example 1:

Input:
N = 12
S = defRTSersUXI
Output: deeIRSfrsTUX
Explanation: Sorted form of given string
with the same case of character as that
in original string is deeIRSfrsTUX
Example 2:

Input:
N = 6
S = srbDKi
Output: birDKs
Explanation: Sorted form of given string
with the same case of character will
result in output as birDKs.
 */

import java.util.Arrays;

public class Case_specific_Sorting_of_Strings {
    public static String caseSort(String str) {
        // Your code here
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                upper.append(c);
            } else if (c >= 'a' && c <= 'z') {
                lower.append(c);
            }
        }

        char[] low = lower.toString().toCharArray();
        char[] high = upper.toString().toCharArray();

        Arrays.sort(low);
        Arrays.sort(high);

        StringBuilder merge = new StringBuilder();

        int lowindex = 0;
        int highindex = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                merge.append(high[highindex++]);
            } else if (c >= 'a' && c <= 'z') {
                merge.append(low[lowindex++]);
            }
        }

        return merge.toString();

    }
}
