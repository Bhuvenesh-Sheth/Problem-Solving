/*
 *Given two strings A and B, find if A is a subsequence of B. A subsequence is a 
 sequence that can be derived from another sequence by deleting
 some elements without changing the order of the remaining elements.

Example 1:

Input:
A = AXY 
B = YADXCP
Output: False
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'.

Example 2:

Input:
A = gksrek
B = geeksforgeeks
Output: True
Explanation: A is a subsequence of B.
 

Your Task:  
You dont need to read input or print anything. Complete the 
function isSubSequence() which takes A and B as input parameters 
and returns a boolean value denoting if A is a subsequence of B or not. 
 */
public class Check_if_a_String_is_Subsequence_of_Other {
    public static boolean isSubSequence(String A, String B) {
        // code here
        int n = A.length();
        int m = B.length();

        if (m == 0) {
            return true;
        }

        if (n < m) {
            String temp = A;
            A = B;
            B = temp;
            int curr = n;
            n = m;
            m = curr;
        }

        int j = 0;

        for (int i = 0; i < n && j < m; i++) {
            if (A.charAt(i) == B.charAt(j))
                j++;
        }

        return (j == m);
    }
}
