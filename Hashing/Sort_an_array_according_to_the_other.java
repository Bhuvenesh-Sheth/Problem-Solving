/*
 * Given two integer arrays A1[ ] and A2[ ] of size N and M respectively. Sort the first array A1[ ] such that all the relative positions of the elements in the first array are the same as the elements in the second array A2[ ].
See example for better understanding.
Note: If elements are repeated in the second array, consider their first occurance only.

Example 1:

Input:
N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {2, 1, 8, 3}
Output: 
2 2 1 1 8 8 3 5 6 7 9
Explanation: Array elements of A1[] are
sorted according to A2[]. So 2 comes first
then 1 comes, then comes 8, then finally 3
comes, now we append remaining elements in
sorted order.
Example 2:

Input:
N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {99, 22, 444, 56}
Output: 
1 1 2 2 3 5 6 7 8 8 9
Explanation: No A1[] elements are in A2[]
so we cannot sort A1[] according to A2[].
Hence we sort the elements in non-decreasing 
order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sortA1ByA2() 
which takes the array A1[ ], array A2[ ] and their respective size N and M as input parameters 
and returns the sorted array A1[ ] such that the relative positions of the elements in A1[ ] are 
same as the elements in A2[ ]. For the elements not present in A2[ ] but in A1[ ], it appends them 
at the last in increasing order. 
 */

import java.util.TreeMap;

public class Sort_an_array_according_to_the_other {
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // storing all the elements of first array in map.
        for (int i = 0; i < N; i++) {
            int element = A1[i];
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        int i = 0;

        for (int l = 0; l < M; l++) {
            // if any element of second array has value more than 0 in map, we
            // store those elements in array and decrement the count in map.
            if (map.containsKey(A2[l])) {
                for (int k = 0; k < map.get(A2[l]); k++)
                    A1[i++] = (A2[l]);
                map.remove(A2[l]);
            }
        }

        // iterating over the map which helps in storing
        // elements in increasing order.
        for (Entry<Integer, Integer> nag : map.entrySet()) {
            // storing elements whose frequency is more than 0, as many times as
            // their count in output list.
            for (int p = 0; p < nag.getValue(); p++)
                A1[i++] = nag.getKey();
        }

        // returning the output.
        return A1;

    }
}
