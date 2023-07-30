/*
 * Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.

Example 1: 

Input: M = 11, N = 9
Output: 2
Explanation: Binary representation of the given 
numbers are: 1011 and 1001, 
2nd bit from right is different.
Example 2:

Input: M = 52, N = 4
Output: 5
Explanation: Binary representation of the given 
numbers are: 110100 and 0100, 
5th-bit from right is different.
 */

public class Rightmost_different_bit {
    public static int posOfRightMostDiffBit(int m, int n) {

        // Your code here
        int xor = (m) ^ (n);

        if (m == n)
            return -1;
        if ((xor & 1) == 1)
            return 1;

        // while(i!=256)
        // {
        // int xor2=(m/2)^(n/2);
        // if((xor2&1)==1)
        // return i;
        // m=m/2;
        // n=n/2;
        // i++;

        // }

        for (int i = 2; i < 256; i++) {
            m = m / 2;
            n = n / 2;
            if ((((m ^ n) & 1) == 1))
                return i;
        }

        return 0;
    }
}
