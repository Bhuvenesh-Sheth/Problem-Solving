/*
 * You are given heights of consecutive buildings. You can move from the roof of a building to the roof of next adjacent building. You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude with each step.

Example 1:

Input:
N = 5
A[] = {1,2,2,3,2}
Output: 1
Explanation: 1, 2 or 2, 3 are the only consecutive 
buildings with increasing heights thus maximum number
of consecutive steps with increase in gain in altitude
would be 1 in both cases.
Example 2:

Input:
N = 4
A[] = {1,2,3,4}
Output: 3
Explanation: 1 to 2 to 3 to 4 is the jump of
length 3 to have maximum number of 
buildings with increasing heights, so maximum steps
with increasing altitude becomes 3.
 */
public class Roof_Top {
    static int maxStep(int A[], int N) {
        // Your code here
        int max = 0;
        int curr = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] < A[i + 1]) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 0;
            }
        }

        return max;
    }
}