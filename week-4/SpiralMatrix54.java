import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,20},
                {4,5},
                {7,8,}
        };
        System.out.println(spiralOrder(arr));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result =  new ArrayList<>();
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;
        int m = 0, n = 0;
        while (rowStart <= rowEnd ){
            if(m == rowStart && n == colStart){
                while (n <= colEnd) {
                    result.add(matrix[m][n]);
                    n++;
                }
                n--;
                rowStart++;
                m = rowStart;
            } else if (m == rowStart && n == colEnd) {
                while (m <= rowEnd) {
                    result.add(matrix[m][n]);
                    m++;
                }
                m--;
                colEnd--;
                n = colEnd;
            } else if (m == rowEnd && n == colEnd) {
                while (n >= colStart) {
                    result.add(matrix[m][n]);
                    n--;
                }
                n++;
                rowEnd--;
                m = rowEnd;
            } else if (m == rowEnd && n == colStart){
                while (m >= rowStart){
                    result.add(matrix[m][n]);
                    m--;
                }
                m++;
                colStart++;
                n = colStart;
            }
        }
        return result;
    }
}
