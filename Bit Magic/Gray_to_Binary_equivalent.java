/*
 * Example 1:

Input: N = 4
Output: 7
Explanation:
Given 4 representing gray code 110.
Binary equivalent of gray code 110 is 100.
Return 7 representing gray code 100.
Example 2:

Input: N = 15
Output: 10
Explanation:
Given 15 representing gray code 1000.
Binary equivalent of gray code 1000 is 1111.
Return 10 representing gray code 1111 
ie binary 1010.
Example 3:

Input: N = 0
Output: 0
Explanation: 
Zero remains the same in all systems.
 */
public class Gray_to_Binary_equivalent {
    public static int grayToBinary(int n) {

        // Your code here
        int res = n;

        while (n > 0) {
            n = n >> 1;
            res ^= n;

        }

        return res;
    }
}
