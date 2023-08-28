/*
 * Given an array of distinct integers, find all the pairs having both negative and positive values of a number
 * in the array.


Example 1:

Input:
n = 8
arr[] = {1,3,6,-2,-1,-3,2,7}
Output: -1 1 -3 3 -2 2
Explanation: 1, 3 and 2 are present 
pairwise positive and negative. 6 and 
7 have no pair.
Example 2:

Input:
n = 3
arr[] = {3,2,1}
Output: 0
Explanation: No such pair exists so the 
output is 0.

Your Task:
You do not need to read input or print anything. Complete the function findPairs() which takes the array A[] and
the size of the array, n, as input parameters and returns a list of integers denoting the pairs. The pair that appears
first(i.e. second element of the pair appears first) in A[] should appear first in the returning list and within the pair,
the negative integer should appear before the positive integer. Return an empty integer list if no such pair exists.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Positive_Negative_Pair {
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        // code here.
        ArrayList<Integer> m = new ArrayList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            if (hm.containsKey(x)) {
                hm.put(x, hm.getOrDefault(x, 0) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        for (int y : arr) {
            if (hm.containsKey(y) && hm.containsKey(-y)) {
                if (y < 0) {
                    m.add(y);
                    m.add(-y);
                } else {
                    m.add(-y);
                    m.add(y);
                }
                hm.remove(y);
            }
        }

        return m;
    }
}
