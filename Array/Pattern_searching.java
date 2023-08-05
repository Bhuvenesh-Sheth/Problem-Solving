/*
 * Given a string str and a pattern pat. You need to check whether the pattern is present or not in the given string. 

Example 1:-

Input:

2
abcdefh
bcd
axzy
xy

Output:
Present
Not present
 */
public class Pattern_searching {
    public static boolean searchPattern(String str, String pat) {
        // code here
        return (str.contains(pat));
    }
}
