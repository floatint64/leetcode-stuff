package org.example;

public class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int result = 0;

        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[0].length; x++) {
                if (mat[y][x] == 1) {
                    boolean skip = false;
                    for (int yy = 0; yy < mat.length; yy++) {
                        if (yy != y && mat[yy][x] == 1) {
                            skip = true;
                            break;
                        }
                    }
                    if (!skip) {
                        for (int xx = 0; xx < mat[0].length; xx++) {
                            if (x != xx && mat[y][xx] == 1) {
                                skip = true;
                                break;
                            }
                        }
                    }

                    if (!skip) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
