/*
 * Input:
n1 = 4, m1 = 3
matrix[][] = {{ 1,  2,  3},
              { 5,  6,  7},
              {11, 10,  9},
              {13, 14, 15}}
Output: 3 2 1 7 6 5 9 10 11 15 14 13
Explanation:
Array after exchanging columns:
3 2 1
7 6 5
9 10 11
15 14 13
 */
public class Reversing_the_columns_of_a_Matrix {
    static void reverseCol(int matrix[][]) {
        // code here

        int low = 0;
        int high = matrix[0].length - 1;

        while (low < high) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
            }
            low++;
            high--;
        }

    }
}
