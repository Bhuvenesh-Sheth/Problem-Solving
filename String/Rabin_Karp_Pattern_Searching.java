/*
 * Given a string S and a pattern P of lowercase characters. The task is to check if the pattern is present in string or not.

Example 1:

Input:
S = aabaacaadaabaaba
P = aaba
Output: Yes
Explanation: You can find the patter at
starting at index 12.
Example 2:

Input:
S = aabaacaadaabaaba
P = asdfa
Output: No
Explanation: Pattern doesn't exist in
the given string S.
Your Task:
You need to complete the function search which takes 3 arguments(S, P and prime q) and returns true if the pattern is found else returns false.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
Note: N = |S|, M = |P|.

Constraints:
1 <= |S|, |P| <= 104
 */
public class Rabin_Karp_Pattern_Searching {
    static int d = 256;

    // Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q) {
        // Your code here
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;

        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (i = 0; i <= N - M; i++) {

            if (p == t) {

                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                if (j == M)
                    return true;
            }

            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;
                if (t < 0)
                    t = (t + q);
            }
        }

        return false;
    }
}
