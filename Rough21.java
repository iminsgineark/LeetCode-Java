package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Rough21 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        if (matrix.length == 0){
            return ls;
        }
        int colBegin = 0;
        int colEnd = matrix.length - 1;
        int rowBegin = 0;
        int rowEnd = matrix[0].length - 1;
        while (colBegin<=colEnd && rowBegin<=rowEnd){
            for (int i = colBegin; i <= colEnd; i++) {
                ls.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                ls.add(matrix[rowEnd][i]);
            }
            colEnd--;
            if (rowBegin <= rowEnd){
                for (int i = colBegin; i <= colEnd; i--) {
                    ls.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if (colBegin <= colEnd){
                for (int i = rowBegin; i <= rowEnd; i++) {
                    ls.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return ls;
    }
    public static void main(String[] args) {

    }
}
