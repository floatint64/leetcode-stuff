package org.example.common;

public class MatrixSimilarityAfterCyclicShifts {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] result = new int[mat.length][mat[0].length];

        for (int y = 0; y < mat.length; y++) {
            result[y] = new int[mat[0].length];
        }


        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[0].length; x++) {
                int shiftsCnt = k % mat[y].length;
                if ((y & 1) > 0) {
                    for (int i = 0; i < shiftsCnt; i++) {
                        result[y][i] = mat[y][mat[0].length - shiftsCnt + i];
                    }

                    for (int i = 0; i < mat[0].length - shiftsCnt; i++) {
                        result[y][shiftsCnt + i] = mat[y][i];
                    }
                } else {
                    for (int i = 0; i < mat[0].length - shiftsCnt; i++) {
                        result[y][i] = mat[y][i + shiftsCnt];
                    }

                    for (int i = 0; i < shiftsCnt; i++) {
                        result[y][mat[0].length - shiftsCnt + i] = mat[y][i];
                    }
                }
            }
        }

        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[0].length; x++) {
                if (result[y][x] != mat[y][x]) {
                    return false;
                }
            }
        }

        return true;
    }
}
