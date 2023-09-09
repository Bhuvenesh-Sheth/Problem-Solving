/*
You are given a string S (both uppercase and lowercase characters). You need to print the repeated character whose first appearance is leftmost.

Example 1:

Input:
S = geeksforgeeks
Output: g
Explanation: We see that both e and g
repeat as we move from left to right.
But the leftmost is g so we print g.
Example 2:

Input:
S = abcd
Output: -1
Explanation: No character repeats so
we print -1.
Your Task:
This is a function problem. You only need to complete the function repeatedCharacter() that takes a string as a parameter and returns the index of the character. If no character repeats then return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).

Constraints:
1 <= |S| <= 100
 */
public class Repeating_Character_First_Appearance_Leftmost {
    static final int CHAR = 256;

    static int repeatedCharacter(String S) {
        // add your code here
        int res = -1;
        boolean[] visited = new boolean[CHAR];

        for (int i = S.length() - 1; i >= 0; i--) {

            if (visited[S.charAt(i)]) {
                res = i;
            } else {
                visited[S.charAt(i)] = true;
            }
        }

        return res;
    }
}