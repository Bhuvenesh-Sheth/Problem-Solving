import java.util.*;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> ans = new ArrayList<Integer>();

        if (row < 1) {
            return ans;
        }

        int rs = 0;
        int cs = 0;

        while (rs < row && cs < col) {

            for (int i = cs; i < col; i++) {
                ans.add(matrix[rs][i]);
            }

            rs++;

            for (int i = rs; i < row; i++) {
                ans.add(matrix[i][col - 1]);
            }

            col--;

            if (rs < row) {
                for (int i = col - 1; i >= cs; i--) {
                    ans.add(matrix[row - 1][i]);
                }
                row--;
            }

            if (cs < col) {
                for (int i = row - 1; i >= rs; i--) {
                    ans.add(matrix[i][cs]);
                }
                cs++;
            }
        }

        return ans;
    }
}
