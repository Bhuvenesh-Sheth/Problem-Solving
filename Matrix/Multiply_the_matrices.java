public class Multiply_the_matrices {
    static int[][] multiplyMatrix(int A[][], int B[][]) {
        // code here
        int[][] finalMat = new int[A.length][B[0].length];
        if (A[0].length == B.length) {

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < B.length; k++) {
                        finalMat[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        } else {
            finalMat = new int[1][1];
            finalMat[0][0] = -1;
        }

        return finalMat;
    }
}
