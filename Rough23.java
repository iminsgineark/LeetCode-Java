//package Arrays;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Rough23 {
//    public static int flippingMatrix(List<List<Integer>> matrix) {
//        // Write your code here
//        int rows = matrix.size();
//        List<Integer> columns = matrix.get(0);
//        List<List<Integer>> ans  = new ArrayList<>();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns.size(); j++) {
//                ans.get(j).get(i) = ans.get(i).get(j);
//            }
//        }
//        return ans;
//    }
//}
