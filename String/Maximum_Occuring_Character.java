/*
 * Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.
 */
public class Maximum_Occuring_Character {
    public static char getMaxOccuringChar(String line) {
        // Your code here
        int arr[] = new int[26];

        for (int i = 0; i < line.length(); i++) {
            int index = 0;
            index = line.charAt(i) - 'a';
            arr[index]++;
        }

        int max = -1, ans = 0;
        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                ans = i;
                max = arr[i];
            }
        }

        return (char) ('a' + ans);
    }
}
