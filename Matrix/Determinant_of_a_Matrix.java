public class Determinant_of_a_Matrix {
    static int determinantOfMatrix(int matrix[][], int n) {
        // code here
        if (n == 1) {
            return matrix[0][0];
        }
        int determinant = 0;
        int sign = 1;
        for (int i = 0; i < n; i++) {
            int subMatrix[][] = new int[n - 1][n - 1];
            int subrow = 0, subcolumn = 0;
            for (int row = 1; row < n; row++) {
                for (int column = 0; column < n; column++) {
                    if (column != i) {
                        subMatrix[subrow][subcolumn] = matrix[row][column];
                        subcolumn++;
                    }
                }
                subrow++;
                subcolumn = 0;
            }
            determinant += sign * matrix[0][i] * determinantOfMatrix(subMatrix, n - 1);
            sign = -sign;
        }
        return determinant;
    }
}
