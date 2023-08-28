/*
 * Given an unsorted array of integers and a sum. The task is to count the number of subarray which adds to the given sum.

Example 1:

Input:
n = 5
arr[] = {10,2,-2,-20,10}
sum = -10
Output: 3
Explanation: Subarrays with sum -10 are: 
[10, 2, -2, -20], [2, -2, -20, 10] and 
[-20, 10].
Example 2:

Input:
n = 6
arr[] = {1,4,20,3,10,5}
sum = 33
Output: 1
Explanation: Subarray with sum 33 is: 
[20,3,10].
Your Task:
This is a function problem. You only need to complete the function subArraySum() that takes arr, n, sum as parameters and returns the count of subarrays 
which adds up to the given sum.
 */

import java.util.HashMap;
import java.util.Map;

public class Subarray_range_with_given_sum {
    static int subArraySum(int arr[], int n, int sum) {
        // add your code here
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int pre_sum = 0;
        map.put(0, 1);

        for (int i : arr) {

            pre_sum += i;

            if (pre_sum == sum || map.containsKey(pre_sum - sum)) {
                count += map.get(pre_sum - sum);
            }

            map.put(pre_sum, map.getOrDefault(pre_sum, 0) + 1);
        }

        return count;
    }

}
