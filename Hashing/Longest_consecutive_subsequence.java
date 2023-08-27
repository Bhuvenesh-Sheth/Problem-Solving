/*
 * Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 

Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.
Example 2:

Input:
N = 7
a[] = {1,9,3,10,4,20,2}
Output:
4
Explanation:
1, 2, 3, 4 is the longest
consecutive subsequence.
 */

import java.util.HashSet;

public class Longest_consecutive_subsequence {
    static int findLongestConseqSubseq(int arr[], int N) {
        // add your code here
        int res = 0;
        HashSet<Integer> map = new HashSet<>();

        for (int x : arr) {
            map.add(x);
        }

        for (int i = 0; i < N; i++) {
            if (!map.contains(arr[i] - 1)) {
                int curr = 1;
                while (map.contains(arr[i] + curr)) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }

        return res;
    }
}
