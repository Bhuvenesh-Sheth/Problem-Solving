/*
 * Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.

Example 1:

Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8 
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,(2, 5), (0, 5), (1, 6)
Example 2:

Input:
n = 5
A[] = {1,1,1,1,0}
Output: 1
Explanation: The index range for the 
subarray is (3,4).
 */

import java.util.HashMap;

public class Subarrays_with_equal_1s_and_0s {
    public static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // add your code here
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                arr[i] = -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int presum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            presum += arr[i];

            if (presum == 0)
                res++;

            if (map.containsKey(presum)) {
                res += map.get(presum);
            }
            if (map.containsKey(presum))
                map.put(presum, map.get(presum) + 1);
            else
                map.put(presum, 1);

        }

        return res;
    }
}
