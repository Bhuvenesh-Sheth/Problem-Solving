/*
 *You have N books, each with Ai number of pages. M students need to be allocated contiguous books, with each student getting at least one book. Out of all the permutations, the goal is to find the permutation where the student with the most books allocated to him gets the minimum number of pages, out of all possible permutations.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).

 

Example 1:

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:113
Explanation:Allocation can be done in 
following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90} Maximum Pages =113.
Therefore, the minimum of these cases is 113,
which is selected as the output.

Example 2:

Input:
N = 3
A[] = {15,17,20}
M = 2
Output:32
Explanation: Allocation is done as
{15,17} and {20}
 */
public class Allocate_minimum_number_of_pages {
    public static boolean isFeasible(int[] A, int N, int M, int ans) {

        int req = 1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (sum + A[i] > ans) {
                req++;
                sum = A[i];
            } else {
                sum += A[i];
            }
        }
        return (req <= M);
    }

    public static int findPages(int[] A, int N, int M) {
        // Your code here

        if (N < M) {
            return -1;
        }

        int sum = 0;
        int mx = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
            mx = Math.max(mx, A[i]);
        }

        int low = mx;
        int high = sum;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(A, N, M, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return res;
    }
}
