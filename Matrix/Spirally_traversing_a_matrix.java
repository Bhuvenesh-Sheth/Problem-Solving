/*
 * Input:
r = 3, c = 4  
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}}
Output: 
1 2 3 4 8 12 11 10 9 5 6 7
Explanation:
Applying same technique as shown above, 
output for the 2nd testcase will be 
1 2 3 4 8 12 11 10 9 5 6 7.
 */

import java.util.ArrayList;

public class Spirally_traversing_a_matrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // code here
        ArrayList<Integer> sp = new ArrayList<Integer>();

        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                sp.add(matrix[top][i]);
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                sp.add(matrix[i][right]);
            }

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    sp.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    sp.add(matrix[i][left]);
                }
                left++;
            }
        }

        return sp;
    }
}
