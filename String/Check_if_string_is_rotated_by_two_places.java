/*
 * Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.

Example 1:

Input:
a = amazon
b = azonam
Output: 1
Explanation: amazon can be rotated anti
clockwise by two places, which will make
it as azonam.
Example 2:

Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 0
Explanation: If we rotate geeksforgeeks by
two place in any direction , we won't get
geeksgeeksfor.
Your Task:
The task is to complete the function isRotated() which takes two strings as input parameters and checks if given strings can be formed by rotations. The function returns true if string 1 can be obtained by rotating string 2 by two places, else it returns false.

Expected Time Complexity: O(N).
Expected Auxilary Complexity: O(N).
Challenge: Try doing it in O(1) space complexity.

Constraints:
1 ≤ length of a, b ≤ 105
 */

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Check_if_string_is_rotated_by_two_places {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s12 = sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            Solution obj = new Solution();

            boolean flag = obj.isRotated(s1, s2);

            if (flag == true)
                System.out.println("1");
            else
                System.out.println("0");

        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2) {
        // Your code here
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        int len = str1.length();

        if (len == 1) {
            return str1.equals(str2);
        }

        String rotatedClockwise = str1.substring(len - 2) + str1.substring(0, len - 2);
        String rotatedCounterclockwise = str1.substring(2) + str1.substring(0, 2);

        return str2.equals(rotatedClockwise) || str2.equals(rotatedCounterclockwise);

    }

}