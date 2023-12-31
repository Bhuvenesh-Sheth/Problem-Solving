/*
 * Given two integers ‘a’ and ‘m’. The task is to find the smallest modular multiplicative inverse of ‘a’ under modulo ‘m’.

Example 1:

Input:
a = 3
m = 11
Output: 4
Explanation: Since (4*3) mod 11 = 1, 4 
is modulo inverse of 3. One might think,
15 also as a valid output as "(15*3)
mod 11"  is also 1, but 15 is not in 
ring {0, 1, 2, ... 10}, so not valid.
 
Example 2:

Input:
a = 10
m = 17
Output: 12
Explanation: Since (12*10) mod 17 = 1,
12 is the modulo inverse of 10.
 */
public class Modular_Multiplicative_inverse {

    public int modInverse(int a, int m) {
        int ans = Integer.MIN_VALUE;
        // Your code here
        for (int i = 1; i < m; i++) {
            int temp = ((a % m) * (i % m)) % m;
            if (temp == 1) {
                return i;
            }
        }

        return -1;
    }

}
