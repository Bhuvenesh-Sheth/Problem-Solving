import java.util.ArrayList;

public class Boundary_traversal_of_matrix {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        // code here
        ArrayList<Integer> boundary = new ArrayList<Integer>();

        if (n == 1) {
            for (int i = 0; i < m; i++) {
                boundary.add(matrix[0][i]);
            }
        } else if (m == 1) {
            for (int i = 0; i < n; i++) {
                boundary.add(matrix[i][0]);
            }
        } else {

            for (int i = 0; i < m; i++) {
                boundary.add(matrix[0][i]);
            }

            for (int i = 1; i < n; i++) {
                boundary.add(matrix[i][m - 1]);
            }

            for (int i = m - 2; i >= 0; i--) {
                boundary.add(matrix[n - 1][i]);
            }

            for (int i = n - 2; i >= 1; i--) {
                boundary.add(matrix[i][0]);
            }
        }

        return boundary;
    }
}
