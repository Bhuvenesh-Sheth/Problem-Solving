/*
 * You are given two numbers n and p. You need to find np.

Example 1:

Input:
n = 9 p = 9 
Output: 387420489
Explanation: 387420489 is the value 
obtained when 9 is raised to the 
power of 9.

Example 2:

Input:
n = 2 p = 9
Output: 512
Explanation: 512 is the value 
obtained when 2 is raised to 
the power of 9. 
 */

public class Power_Using_Recursion {

    static int RecursivePower(int n, int p) {
        // add your code here
        if (n == 0)
            return 0;
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            int ans = RecursivePower(n, p / 2);
            return ans * ans;
        } else {
            int ans2 = RecursivePower(n, (p - 1) / 2);
            return n * ans2 * ans2;
        }
    }
}
