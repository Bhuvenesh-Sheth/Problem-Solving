/*
 * Given n integer ranges, the task is to find the maximum occurring integer in these ranges. If more than one such integer exists, find the smallest one. The ranges are given as two arrays L[] and R[].  L[i] consists of starting point of range and R[i] consists of corresponding end point of the range.

For example consider the following ranges.
L[] = {2, 1, 3}, R[] = {5, 3, 9)
Ranges represented by above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.

Example 1:

Input:
n = 4
L[] = {1,4,3,1}
R[] = {15,8,5,4}
Output: 4
Explanation: The given ranges are [1,15]
 [4, 8] [3, 5] [1, 4]. The number that 
is most common or appears most times in 
the ranges is 4.
Example 2:

Input:
n = 5
L[] = {1,5,9,13,21}
R[] = {15,8,12,20,30}
Output: 5
Explanation: The given ranges are 
[1,15] [5, 8] [9, 12] [13, 20] 
[21, 30]. The number that is most 
common or appears most times in 
the ranges is 5.
 */
public class Maximum_occured_integer {
    public static int maxOccured(int L[], int R[], int n, int maxx) {
        int freq[] = new int[1000001];

        for (int i = 0; i < n; i++) {
            freq[L[i]]++;
            freq[R[i] + 1]--;
        }

        int res = 0;

        for (int i = 1; i < 1000001; i++) {
            freq[i] = freq[i - 1] + freq[i];
            if (freq[i] > freq[res])
                res = i;
        }

        return res;

    }
}
