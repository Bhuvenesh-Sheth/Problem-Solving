/*
 *Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9 
 */

import java.util.ArrayList;

public class Reverse_array_in_groups {
    ArrayList<Integer> reverse(ArrayList<Integer> arr, int low, int high) {

        while (low <= high) {
            int temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);

            low++;
            high--;
        }

        return arr;
    }

    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

        // code here
        int low = 0;
        int high = k - 1;

        while (low < n) {
            high = Math.min(high, n - 1);
            arr = reverse(arr, low, high);

            low += k;
            high += k;
        }

    }
}
