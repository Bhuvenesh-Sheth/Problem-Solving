/*
 * Given two sorted arrays of sizes N and M respectively. The task is to find the median of the two arrays when they get merged.
If there are even number of elements in the resulting array, find the floor of the average of two medians.

 

Example 1:

Input:
N = 5, M = 6 
arr[] = {1,2,3,4,5}
brr[] = {3,4,5,6,7,8}
Output: 4
Explanation: After merging two arrays, 
elements will be as 1 2 3 3 4 4 5 5 6 7 8
So, median is 4.
 

Example 2:

Input:
N = 2, M = 3 
arr[] = {1,2}
brr[] = {2,3,4}
Output: 2
Explanation: After merging two arrays, 
elements will be as 1 2 2 3 4. So, 
median is 2.
 */
public class Median_of_Two_sorted_arrays {
    public static int findMedian(int arr[], int n, int brr[], int m) {
        // Your code here
        if (m < n) {
            return findMedian(brr, m, arr, n);
        }
        int start = 0;
        int end = n;
        int ans = 0;
        while (start <= end) {
            int i1 = (start + end) / 2;
            int i2 = ((n + m + 1) / 2) - i1;
            int min1 = (i1 == n) ? Integer.MAX_VALUE : arr[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : arr[i1 - 1];
            int min2 = (i2 == m) ? Integer.MAX_VALUE : brr[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : brr[i2 - 1];
            if ((max1 <= min2) && (max2 <= min1)) {
                if ((n + m) % 2 == 0) {
                    ans = (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                    break;
                } else {
                    ans = Math.max(max1, max2);
                    break;
                }
            } else if (max1 > min2) {
                end = i1 - 1;
            } else {
                start = i1 + 1;
            }
        }
        return ans;
    }
}
