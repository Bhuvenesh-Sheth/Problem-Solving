public class Adding_two_matrices {
    static int[][] sumMatrix(int A[][], int B[][]) {
        // code here
        int[][] finalMat = new int[A.length][A[0].length];
        if ((A.length == B.length) && (A[0].length == B[0].length)) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    finalMat[i][j] = A[i][j] + B[i][j];
                }
            }
        } else {
            finalMat = new int[1][1];
            finalMat[0][0] = -1;
        }

        return finalMat;
    }
}