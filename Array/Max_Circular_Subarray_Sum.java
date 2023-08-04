/*
 * Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum.


Example 1:

Input:
N = 7
arr[] = {8,-8,9,-9,10,-11,12}
Output:
22
Explanation:
Starting from the last element
of the array, i.e, 12, and 
moving in a circular fashion, we 
have max subarray as 12, 8, -8, 9, 
-9, 10, which gives maximum sum 
as 22.
Example 2:

Input:
N = 8
arr[] = {10,-3,-4,7,6,5,-4,-1}
Output:
23
Explanation: Sum of the circular 
subarray with maximum sum is 23
 */
public class Max_Circular_Subarray_Sum {
    static int normalSum(int arr[], int n) {

        int res = arr[0];
        int maxending = arr[0];

        for (int i = 1; i < n; i++) {
            maxending = Math.max(maxending + arr[i], arr[i]);
            res = Math.max(res, maxending);
        }

        return res;
    }

    static int circularSubarraySum(int a[], int n) {

        // Your code here
        int max_normal = normalSum(a, n);

        if (max_normal < 0)
            return max_normal;

        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += a[i];
            a[i] = (-1) * a[i];
        }
        int max_circular = arr_sum + normalSum(a, n);

        return Math.max(max_normal, max_circular);
    }
}
