/*
 * Consider the set of irreducible fractions A = {n/d | n≤d and d ≤ 10000 and gcd(n,d) = 1}.You are given a member of this set and your task is to find the largest fraction in this set less than the given fraction.
Note : this is a set and so all the members are unique.

Example 1:

Input: n = 1, d = 8
Output: 1249 9993
Explanation: 1/8 >= 1249/9993 and this 
is the largest fraction. 
Example 2:

Input: n = 2, d = 53
Output: 377 9991
Explanation: 2/53 >= 377/9991 and this is 
the largest fraction.
 */
public class Fraction_Trouble {
    public int[] LargestFraction(int n, int d) {
        // code here
        int maxInt = 10000;
        int num = -1;
        int deno = 1;

        for (int q = maxInt; q > 1; q--) {
            int p = (n * q - 1) / d;
            if (gcd(p, q) == 1 && (num * q <= deno * p)) {
                num = p;
                deno = q;
            }
        }

        return new int[] { num, deno };
    }

    public int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
}
