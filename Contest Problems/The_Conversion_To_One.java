/*
 *You are given a number N. You need to convert it to 1 in minimum number of operations.

The operations allowed are as follows:

If N is even then divide the number by 2.
If N is odd then you can either add 1 to it or subtract 1 from it.
Using the above operations, find the minimum number of operations require to convert N to 1.

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. 
Each testcase contains 1 line of input containing N.

Output:
For each testcase, in a new line, print the minimum number of steps required.

Constraints:
1 <= T <= 100
1 <= N <= 107

Examples:
Input:
4
1
2
3
4
Output:
0
1
2
2

Explanation:
Testcase1: 1 can be converted into 1 in 0 steps.
Testcase2: 2 can be converted into 1 in 1 step: 2-1
 */
public class The_Conversion_To_One {
    public static long minOperations(long n) {
        if (n == 1)
            return 0; // since 1 is already 1
        if (n == 2)
            return 1; // convert 2 to 1. 1 step
        if (n == 3)
            return 2; // convert 3 to 2. Then 2 to 1. 2 steps
        long total = 0; // save total steps
        if (n % 2 != 0) // if odd
        {
            total = 1 + Math.min(minOperations(n - 1), minOperations(n + 1));
            // convert n to n-1 or n+1 then minimum of those conversions
        } else
            total = 1 + minOperations(n / 2); // convert n to n/2 then count operations required for n/2 to 1

        return total; // returning total at the end
    }
}
