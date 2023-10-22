/*
 * You are given string str. You need to remove the pair of duplicates.
Note: The pair should be of adjacent elements and after removing a pair the remaining string is joined together. 

Example 1:

Input:
aaabbaaccd

Output: 
ad

Explanation: 
Remove (aa)abbaaccd =>abbaaccd
Remove a(bb)aaccd => aaaccd
Remove (aa)accd => accd
Remove a(cc)d => ad
Example 2:

Input: 
aaaa

Output: 
Empty String

Explanation: 
Remove (aa)aa => aa
Again removing pair of duplicates then (aa) 
will be removed and we will get 'Empty String'.

Your Task:
This is a function problem. You only need to complete the function removePair() that takes a string as a parameter and returns the modified string. Return an empty string if the whole string is deleted.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
N = length of the string.

Constraints:
1 <= |str| <= 103
 */

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Removing_consecutive_duplicates_two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading number of testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // Reading the string that needs to processed
            String str = br.readLine().trim();

            // calling the removePair method of class solve
            String ans = new Solution().removePair(str);

            // if the new processed string is empty
            // then we print "Empty String"
            if (ans.length() <= 0)
                System.out.println("Empty String");

            // otherwise we print the new string
            else
                System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str) {
        // your code here
        Deque<Character> s = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!s.isEmpty() && s.peek() == str.charAt(i)) {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }

        while (!s.isEmpty()) {
            ans.insert(0, s.pop());
        }

        return ans.toString();
    }
}
