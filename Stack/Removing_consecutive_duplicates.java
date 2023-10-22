/*
 * You are given string str. You need to remove the consecutive duplicates from the given string using a Stack.
 

Example 1:

Input: 
aaaaaabaabccccccc

Output: 
ababc

Explanation: 
The order is in the following way 6->a, 1->b, 2->a, 1->b, 7->c. 
So, only one element from each group will remain and rest all are removed.
Therefore, final string will be:- ababc.

Example 2:

Input: 
abbccbcd

Output: 
abcbcd

Explanation: 
The order is in the following way 1->a, 2->b, 2->c, 1->b, 1->c, 1->d.
So, only one element from each group will remain and rest all are removed.
Therefore, final string will be:- abcbcd. 
Your Task:
This is a function problem. You need to complete the function removeConsecutiveDuplicates() that takes a string as a parameter and returns the modified string. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= |str| <= 103
 */

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Removing_consecutive_duplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // taking the length of the string
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            // taking the string
            String str = br.readLine().trim();

            // calling removeConsecutiveDuplicates method of class solve
            System.out.println(new Solution().removeConsecutiveDuplicates(str));
        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str) {
        // Your code here
        Deque<Character> s = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();

        s.push(str.charAt(0));
        ans.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (s.peek() != str.charAt(i)) {
                s.push(str.charAt(i));
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }
}