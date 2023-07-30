/*
 * You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.
Example 2:

Input: A = 20, B = 25
Output: 3
Explanation:
A  = 10100
B  = 11001
As we can see, the bits of A that need 
to be flipped are 10100. If we flip 
these bits, we get 11001, which is B
 */
public class Bit_Difference {
    public static int countBitsFlip(int a, int b) {

        // Your code here
        int x = a ^ b;

        int table[] = new int[256];
        table[0] = 0;

        for (int i = 1; i < 256; i++) {
            table[i] = table[i & (i - 1)] + 1;
        }

        return table[x & 255] + table[(x >> 8) & 255] + table[(x >> 16) & 255] + table[(x >> 24)];
    }
}
