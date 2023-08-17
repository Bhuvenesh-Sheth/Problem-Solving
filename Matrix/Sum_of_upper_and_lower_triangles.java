/*
 *Given a square matrix of size N*N, print the sum of upper and lower triangular elements.
 Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. 

Example 1:

Input:
N = 3 
mat[][] = {{6, 5, 4},
           {1, 2, 5}
           {7, 9, 7}}
Output: 29 32
Explanation:
The given matrix is
6 5 4
1 2 5
7 9 7
The elements of upper triangle are
6 5 4
  2 5
    7
Sum of these elements is 6+5+4+2+5+7=29
The elements of lower triangle are
6
1 2
7 9 7
Sum of these elements is 6+1+2+7+9+7= 32.
Example 2:

Input:
N = 2
mat[][] = {{1, 2},
           {3, 4}}
Output: 7 8
Explanation:
Upper triangular matrix:
1 2
  4
Sum of these elements are 7.
Lower triangular matrix:
1
3 4
Sum of these elements are 8. 
 */

import java.util.ArrayList;

public class Sum_of_upper_and_lower_triangles {
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        // code here
        int upper = 0;// since in uppertriangle sizeofrow<size of column and vice versa in lower
        int lower = 0;
        int common = 0;// row=column
        ArrayList<Integer> sum = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j || i == j) {
                    upper += matrix[i][j];
                }
                if (i > j || i == j) {
                    lower += matrix[i][j];
                }
            }
        }

        sum.add(upper);
        sum.add(lower);

        return sum;

    }
}
