package Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans  = new ArrayList<>();
        if (matrix.length == 0){
            return ans;
        }
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd){
            //left traverse
            for (int i = colBegin; i <= colEnd ; i++) {
                System.out.println(matrix[rowBegin][i]);
            }
            rowBegin++;

            // traverse down
            for (int i = rowBegin; i <= rowEnd; i++) {
                System.out.println(matrix[i][colEnd]);
            }
            colEnd--;

            // traverse left
            if (rowBegin <= rowEnd){
                for (int i = colEnd; i <= colBegin ; i++) {
                    System.out.println(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            // traverse UP
            if (colBegin <= colEnd){
                for (int i = rowEnd; i <=rowBegin; i++) {
                    System.out.println(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
