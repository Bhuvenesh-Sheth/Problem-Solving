/*
 * You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

Example 1:

Input:
n = 1
Output: 1
Explanation: The first fibonacci
 number is 1
Example 2:

Input:
n = 20
Output:6765
Explanation: The 20th fibonacci 
number is 6765
 */
public class Fibonacci_Using_Recursion {
    static int fibonacci(int n) {
        // your code here
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int ans = fibonacci(n - 1) + fibonacci(n - 2);
        return ans;
    }
}
