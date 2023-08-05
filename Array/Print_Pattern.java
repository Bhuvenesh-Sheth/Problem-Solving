/*
 * Print a sequence of numbers starting with N where A[0] = N, without using loop, in which  A[i+1] = A[i] - 5,  until A[i] > 0. After that A[i+1] = A[i] + 5  repeat it until A[i] = N.

Example 1:

Input: N = 16
Output: 16 11 6 1 -4 1 6 11 16
Explaination: The value decreases until it 
is greater than 0. After that it increases 
and stops when it becomes 16 again.
Example 2:

Input: N = 10
Output: 10 5 0 5 10
Explaination: It follows the same logic as 
per the above example.
 */

import java.util.ArrayList;
import java.util.List;

public class Print_Pattern {
    static void addPattern(List<Integer> list, int N) {

        if (N <= 0) {
            list.add(N);
            return;
        }

        list.add(N);
        addPattern(list, N - 5);
        list.add(N);

    }

    static List<Integer> pattern(int N) {
        // code here
        int n = N;
        List<Integer> list = new ArrayList<>();
        addPattern(list, N);
        return list;

    }
}
