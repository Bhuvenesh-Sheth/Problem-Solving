import java.util.ArrayList;

public class Print_Matrix_in_snake_Pattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> Pattern = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    Pattern.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    Pattern.add(matrix[i][j]);
                }
            }
        }

        return Pattern;
    }
}
