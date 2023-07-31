/*
 * You are given a number n. You need to find the sum of digits of n.

Example 1:

Input:
n = 1
Output: 1
Explanation: Sum of digit of 1 is 1.
Example 2:

Input:
n = 99999
Output: 45
Explanation: Sum of digit of 99999 is 45.
 */
public class Sum_of_Digits_of_a_Number {
    public static int sumOfDigits(int n) {
        // add your code here
        if (n < 10)
            return n;

        return n % 10 + sumOfDigits(n / 10);
    }
}
