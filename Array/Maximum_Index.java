/*
 * Given an array A[] of N positive integers.
 * The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
 

Example 1:

Input:
N = 2
A[] = {1, 10}
Output:
1
Explanation:
A[0]<A[1] so (j-i) is 1-0 = 1.
Example 2:

Input:
N = 9
A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array A[1] < A[7]
satisfying the required 
condition(A[i] < A[j]) thus giving 
the maximum difference of j - i 
which is 6(7-1).
 */
public class Maximum_Index {
    static int maxIndexDiff(int A[], int N) {

        // Your code here
        int leftmin[] = new int[N];
        leftmin[0] = A[0];

        int rightmax[] = new int[N];
        rightmax[N - 1] = A[N - 1];

        int m = -1;

        // for leftmax
        for (int i = 1; i < N; i++) {
            leftmin[i] = Math.min(leftmin[i - 1], A[i]);
        }

        // for rightmax
        for (int i = N - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], A[i]);
        }

        int i = 0;
        int j = 0;
        while (i < N && j < N) {
            if (leftmin[i] <= rightmax[j]) {
                m = Math.max(m, j - i);
                j++;
            } else {
                i++;
            }
        }

        return m;

    }
}
