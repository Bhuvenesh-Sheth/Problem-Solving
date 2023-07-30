/*
 * Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.

 

Example 1:

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation: 
9223372036854775807 + 9223372036854775807 
= 18446744073709551614.
18446744073709551614 mod (109+7)
= 582344006
 

Example 2:

Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: 1000000007 + 1000000007 =
(2000000014) mod (109+7) = 0
 */
public class Addition_Under_Modulo {
    public static long sumUnderModulo(long a, long b) {
        // code here
        long M = 1000000007;
        return ((a % M) + (b % M)) % M;
    }
}
