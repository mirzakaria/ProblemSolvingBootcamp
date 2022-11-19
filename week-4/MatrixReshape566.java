import java.util.Arrays;

public class MatrixReshape566 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4},
                {7, 8},
        };
//        System.out.println(Arrays.asList(arr));
        int r = 2;
        int c = 3;
        int[][] res = matrixReshape(arr, r, c);
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(matrixReshape(arr, r, c)));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
//        https://leetcode.com/problems/reshape-the-matrix/
        int[][] res = new int[r][c];
        if((mat.length * mat[1].length) != r * c){
            return mat;
        } else {
//            int m = mat.length;
            int n = mat[0].length;
            for(int i = 0; i < r * c; i++){
                res[i / c][i % c] = mat[i / n][i % n];
            }
            return res;
        }
    }
}
