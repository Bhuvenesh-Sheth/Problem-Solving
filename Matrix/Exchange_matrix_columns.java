public class Exchange_matrix_columns {
    static void exchangeColumns(int matrix[][]) {
        // code here
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][matrix[0].length - 1];
            matrix[i][matrix[0].length - 1] = temp;
        }
    }
}
