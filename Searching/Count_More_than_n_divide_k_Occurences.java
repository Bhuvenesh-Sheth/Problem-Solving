/*
 *Given an array arr[] of size N and an element k. The task is to find all elements in array that appear more than n/k times.

Example 1:

Input:
N = 8
arr[] = {3,1,2,2,1,2,3,3}
k = 4
Output: 2
Explanation: In the given array, 3 and
 2 are the only elements that appears 
more than n/k times.
Example 2:

Input:
N = 4
arr[] = {2,3,3,2}
k = 3
Output: 2
Explanation: In the given array, 3 and 2 
are the only elements that appears more 
than n/k times. So the count of elements 
are 2.
 */

import java.util.Arrays;

public class Count_More_than_n_divide_k_Occurences {
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        Arrays.sort(arr);

        int count = 1;
        int c = 0;
        int num = n / k;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count == num + 1) {
                    c++;
                }
            } else {
                count = 1;
            }
        }

        return c;
    }
}
