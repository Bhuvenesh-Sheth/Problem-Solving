/*
 * Given a matrix of dimensions n1 x m1. Interchange its rows in-place such that the first row will become the last row and so on. 

Example 1:

Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12},
             {13, 14, 15,16}}
Output: 
13 14 15 16 9 10 11 12 5 6 7 8 1 2 3 4
Explanation:
Matrix after exchanging rows:
13 14 15 16
 9 10 11 12
 5  6  7  8
 1  2  3  4
Note: Output is printed row-wise linearly. 
Example 2:

Input:
n1 = 5, m1 = 3
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
matrix[][] = {{1, 2, 3},
             {4, 5, 6},
             {7, 8, 9},
             {10, 11, 12},
             {13, 14, 15}}
Output: 
13 14 15 10 11 12 7 8 9 4 5 6 1 2 3
Explanation:
After interchanging rows:
13 14 15
10 11 12
 7  8  9
 4  5  6
 1  2  3
 */
public class Interchanging_the_rows_of_a_Matrix {
    static void interchangeRows(int matrix[][]) {
        // code here
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[(matrix.length - 1) - j][i];
                matrix[(matrix.length - 1) - j][i] = temp;
            }
        }
    }
}
