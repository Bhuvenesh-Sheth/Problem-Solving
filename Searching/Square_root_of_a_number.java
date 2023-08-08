/*
 * Given an integer x, find the square root of x.
 * If x is not a perfect square, then return floor(√x).
Example 1:

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
Example 2:

Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
 */
public class Square_root_of_a_number {
    long floorSqrt(long x) {
        // Your code here
        long low = 0;
        long high = x;
        long ans = -1;

        while (low <= high) {

            long mid = low + (high - low) / 2;
            long squ = mid * mid;

            if (squ == x)
                return mid;
            else if (squ > x)
                high = mid - 1;
            else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }
}
