/*
 * You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.

Example 1:

Input:
N = 10
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
sum = 14
Output: 
1

Explanation: 
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
and sum = 14.  There is a pair {4, 10} 
with sum 14.
Example 2:

Input:
N = 2
arr[] = {2, 5}
sum = 10
Output:
0

Explanation: 
arr[]  = {2, 5} and sum = 10. 
There is no pair with sum 10.
 */

import java.util.HashSet;

public class Hashing_for_pair_one {
    public static int sumExists(int arr[], int N, int sum) {
        // Your code here, Geeks

        HashSet<Integer> a = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            if (a.contains(sum - arr[i])) {
                return 1;
            } else {
                a.add(arr[i]);
            }
        }

        return 0;
    }
}
