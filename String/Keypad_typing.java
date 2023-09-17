/*
 *You are given a n length string S of lowercase alphabet characters and the task is to find its matching decimal
 representation as on the shown keypad. Output the decimal representation corresponding to the string.
 For ex: if you are given amazon then its corresponding decimal representation will be 262966.

 
Example 1:

Input:
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad.
Example 2:

Input:
S = geeksquiz
Output: 433577849
Explanation: geeksquiz is 433577849 in
decimal when we type it using the given
keypad.
Your Task:
Complete printNumber() function that takes string s and its length as parameters and returns the corresponding decimal representation of the given string as a string type. The printing is done by the driver code.

Constraints:
1 ≤ length of String ≤ 100

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

 */
public class Keypad_typing {
    public static String printNumber(String s, int n) {
        // Your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String c = String.valueOf(s.charAt(i));
            if ("abc".contains(c)) {
                sb.append(2);
            } else if ("def".contains(c)) {
                sb.append(3);
            } else if ("ghi".contains(c)) {
                sb.append(4);
            } else if ("jkl".contains(c)) {
                sb.append(5);
            } else if ("mno".contains(c)) {
                sb.append(6);
            } else if ("pqrs".contains(c)) {
                sb.append(7);
            } else if ("tuv".contains(c)) {
                sb.append(8);
            } else {
                sb.append(9);
            }

        }
        return sb.toString();

    }
}
