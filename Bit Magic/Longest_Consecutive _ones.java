/*
 * Given a number N. Find the length of the longest consecutive 1s in its binary representation.

Example 1:

Input: N = 14
Output: 3
Explanation: 
Binary representation of 14 is 
1110, in which 111 is the longest 
consecutive set bits of length is 3.
Example 2:

Input: N = 222
Output: 4
Explanation: 
Binary representation of 222 is 
11011110, in which 1111 is the 
longest consecutive set bits of length 4. 
 */
public class Longest_Consecutive_ones {
    public static int maxConsecutiveOnes(int N) {

        // Your code here
        int max = 0;
        int count = 0;

        while (N > 0) {
            if ((N & 1) == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
            N = N >> 1;
        }

        return max;
    }
}
