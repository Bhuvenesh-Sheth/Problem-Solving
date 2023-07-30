/*
 * You are given two numbers a and b. You need to find the multiplication of a and b under modulo M (M as 109+7).

Example 1:

Input:
a = 92233720368547758
b = 92233720368547758
Output: 484266119
Explanation: Multiplication of a and b 
under modulo M will be 484266119.
Example 2:

Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: Multiplication of a and b
under modulo M is 0.
 */

public class Multiplication_Under_Modulo {
    static long multiplicationUnderModulo(long a, long b) {
        // add your code here
        long M = 1000000007;
        return ((a % M) * (b % M) % M);
    }
}
