/*
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)
 */
public class Kadane_Algorithm {
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n) {

        // Your code here
        long res = arr[0];
        long maxsum = arr[0];

        for (int i = 1; i < n; i++) {
            res = Math.max(res + arr[i], arr[i]);
            maxsum = Math.max(maxsum, res);
        }

        return maxsum;
    }
}
